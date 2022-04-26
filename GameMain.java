package Pocketmon;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("======캐릭터 성장 프로그램==");
		System.out.println("=======================");
		
		System.out.println("캐릭터를 선택하세요. 1.피카츄 2. 꼬북이 3.이상해씨");
		int a=sc.nextInt();
		Pocketmon pocketmon=null;
		switch(a)
		{
		case 1:
			pocketmon=new Picachu();
			break;
		case 2:
			pocketmon=new Gobook();
			break;
		case 3:
			pocketmon=new Lee();
			break;
		
		default:
			System.out.println("포켓몬을 올바르게(1~3) 선택하세요.");
			System.out.println("잘못 선택하셨습니다.");
		}
		PlayGame pg = null;
		
		if(pocketmon==null)
		{
			System.out.println("게임을 종료합니다.");
		}
		else
		{
			pg=new PlayGame(pocketmon);
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
		System.out.println("프로그램이 종료됩니다.");
	}

}

class PlayGame
{
	private Pocketmon pocketmon;
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
	PlayGame(Pocketmon pocketmon)
	{
		this.pocketmon=pocketmon;
	}
	void printMenu(Scanner sc)
	{
		System.out.println("1.밥먹이기, 2. 잠재우기, 3. 놀아주기 4.운동시키기 5.싸우기 6. 종료");
		menu=sc.nextInt();
	}
	void play()
	{
		switch(menu)
		{
		case 1:
			pocketmon.eat();
			break;
		case 2:
			pocketmon.sleep();
			break;
		case 3:
			pocketmon.play();
			break;
		case 4:
			pocketmon.train();
			break;
		case 5:
			pocketmon.fight();
			break;
		}
		pocketmon.printInfo();
	}
}
abstract class Pocketmon
{
	protected int hp;
	protected int level;
	protected int energy;
	protected int exp;
	protected boolean win;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void fight();
	public abstract boolean levelUp();

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

	public void evolution()
	{
		if(level>5)
		{
			System.out.println("진화되었습니다.");
			
		}
		
	}
	public void printInfo()
	{
		System.out.println("현재 캐릭터의 정보");
		System.out.println("hp="+hp+" / "+"energy="+energy+" / "+"exp="+exp+"level="+level);
	}
}

class Picachu extends Pocketmon
{
	Picachu()
	{
		hp=30;
		level=1;
		energy=50;
		exp=0;
		System.out.println("피카츄를 얻었습니다");
		printInfo();
	}
	public void eat()
	{
		energy=energy+10;
	}
	public void sleep()
	{
		energy+=20;
	}
	public boolean play()
	{
		energy-=20;
		hp+=5;
		return checkEnergy();
	}
	public boolean train()
	{
		energy-=15;
		hp+=20;
		return checkEnergy();
	}
	public void fight()
	{
		exp+=20;
		
	}
	public boolean levelUp()
	{
		if(exp>80)
		{
			level++;
		}
		return true;
		
	}
	public void evolution()
	{
		if(level>5)
		{
			System.out.println("라이츄로 진화되었습니다.");		
		}
	}	
	
}

class Gobook extends Pocketmon
{
	Gobook()
	{
		hp=30;
		level=1;
		energy=50;
		exp=0;
		System.out.println("꼬부기를 얻었습니다");
		printInfo();
	}
	public void eat()
	{
		energy=energy+10;
	}
	public void sleep()
	{
		energy+=20;
	}
	public boolean play()
	{
		energy-=20;
		hp+=5;
		return checkEnergy();
	}
	public boolean train()
	{
		energy-=15;
		hp+=20;
		return checkEnergy();
	}
	public void fight()
	{
		exp+=20;
	}
	public boolean levelUp()
	{
		if(exp>80)
		{
			level++;
//			hp-=40;
		}
		return true;
	}
	public void evolution()
	{
		if(level>5)
		{
			System.out.println("어니부기로 진화되었습니다.");		
		}
	}
}

class Lee extends Pocketmon
{
	Lee()
	{
		hp=40;
		level=1;
		energy=30;
		exp=0;
		System.out.println("이상해씨를 얻었습니다");
		printInfo();
	}
	public void eat()
	{
		energy=energy+10;
	}
	public void sleep()
	{
		energy+=20;
	}
	public boolean play()
	{
		energy-=20;
		hp+=5;
		return checkEnergy();
	}
	public boolean train()
	{
		energy-=15;
		hp+=20;
		return checkEnergy();
	}
	public void fight()
	{
//		if (win)
//		{
			exp+=20;
//		}
	}
	public boolean levelUp()
	{
		if(exp>80)
		{
			level++;
//			hp-=40;
		}
		return true;
	}
	public void evolution()
	{
		if(level>5)
		{
			System.out.println("이상해풀로 진화되었습니다.");		
		}
	}
}