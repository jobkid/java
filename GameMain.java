package character;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PlayGame pg = new PlayGame(new Picachu());
//		PlayGame pg = new PlayGame(new Gobook());
//		PlayGame pg = new PlayGame(new Lee());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("========================");
		System.out.println("========ĳ���ͼ������α׷�===");
		System.out.println("========================");
		
		System.out.println("ĳ���͸� �����ϼ���. 1.��ī�� 2.������ 3.�̻��ؾ�");
		int a = sc.nextInt();
		Character character=null;
		switch(a)
		{
		case 1:
			character = new Picachu();
			break;
		case 2:
			character = new Gobook();
			break;
		case 3:
			character = new Lee();
			break;
		default:
//			System.out.println("ĳ���͸� �ùٸ���(1~3) �����ϼ���.");
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}

		PlayGame pg;
		
		if(character==null)
		{
			System.out.println("������ �����մϴ�.");
			return;
		}
		else
		{
			pg = new PlayGame(character);
		}
		
		while(true)
		{
			pg.printMenu(sc);
			pg.play();
			if (pg.isExit()==true)
			{
				break;
			}
		}
		System.out.println("���α׷��� ����˴ϴ�.");
		
		
	}

}

class PlayGame
{
	private Character character;
	private int menu;
	private boolean exit;
	
	public boolean isExit()
	{
		return exit;
	}
	public void setExit(boolean exit)
	{
		this.exit=exit;
	}
	
	PlayGame(Character character)
	{
		this.character=character;
		exit = false;
	}
	void printMenu(Scanner sc)
	{
		System.out.println("1. ����̱�, 2. ������ 3. ����ֱ� 4. ���Ű�� 5. ����");
		menu=sc.nextInt();
	}
	void play()
	{
		switch(menu)
		{
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			break;
		case 4:
			character.train();
			break;
		case 5:
			character.levelUp();
			break;
		}
		character.printInfo();
	}
}
abstract class Character
{
	protected int hp;//����ġ
	protected int level=0;//����
	protected int energy;//������
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	
	public boolean checkEnergy()
	{
		if(energy<=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void printInfo()
	{
		System.out.println("���� ĳ������ ����");
		System.out.println("hp="+hp+"/"+"energy="+energy+"level="+level);
	}
	
}

class Picachu extends Character
{
	Picachu()
	{
		hp=30;
		energy=50;
		System.out.println("��ī�߰� �����Ǿ����ϴ�.");
		printInfo();
	}
	public void eat()
	{
		energy=energy+10;
	}
	public void sleep()
	{
		energy=energy+5;
	}
	public boolean train()
	{
		energy=energy-15;
		hp=hp+20;
		levelUp();
		return checkEnergy();
	}
	public boolean play()
	{
		energy=energy-20;
		hp=hp+5;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if(hp>=40)
		{
			level++;
			hp=hp-40;
		}
		
	}
}

class Gobook extends Character
{
	Gobook()
	{
		hp=40;
		energy=50;
		System.out.println("�����̰� �����Ǿ����ϴ�.");
		printInfo();
	}
	public void eat()
	{
		energy=energy+15;
	}
	public void sleep()
	{
		energy=energy+10;
	}
	public boolean train()
	{
		energy=energy-30;
		hp=hp+20;
		levelUp();
		return checkEnergy();
	}
	public boolean play()
	{
		energy=energy-20;
		hp=hp+5;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if(hp>=50)
		{
			level++;
			hp=hp-50;
		}
		
	}
}

class Lee extends Character
{
	Lee()
	{
		hp=20;
		energy=30;
		System.out.println("�̻��ؾ��� �����Ǿ����ϴ�.");
		printInfo();
	}
	public void eat()
	{
		energy=energy+5;
	}
	public void sleep()
	{
		energy=energy+20;
	}
	public boolean train()
	{
		energy=energy-10;
		hp=hp+20;
		levelUp();
		return checkEnergy();
	}
	public boolean play()
	{
		energy=energy-10;
		hp=hp+5;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if(hp>=35)
		{
			level++;
			hp=hp-35;
		}
		
	}
}