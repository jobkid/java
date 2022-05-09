package my_collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class CoffeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŀ�� ���� ���α׷�
		//���ݸ� ������ �� �ִ�.
		//Ŀ���̸����� �˻��ϰ�, �����ϰ�, ���� ����.
		
		ArrayList<Coffee> c1 =new ArrayList<Coffee>();
		CoffeMenu cm = new CoffeMenu();
		cm.menuProcess(c1);
		
		

	}

}

class CoffeMenu
{
	private Scanner sc = new Scanner(System.in);
	private int menu;
	boolean flag=true;
	private String menuStr = "1. �߰� 2. �˻� 3. ���� 5. ���� 5. ��ü��� 6. ������ �ʱ�ȭ 7 ����";
	
	public void menuProcess(ArrayList<Coffee> data)
	{
		//System.out.println("1. �߰� 2. �˻� 3. ���� 4. ���� 5. ��ü��� 6. ������ �ʱ�ȭ 7. ����");
		int idx=0;
		while(flag)
		{
			System.out.println(menuStr);
			menu=sc.nextInt();
			
			switch(menu)
			{
			case 1:
				Coffee c=addCoffee();
				
				boolean cRet=data.add(c);
				if(cRet==true)
				{
					System.out.println(c);
					System.out.println("Ŀ�Ǹ� �߰��߽��ϴ�.");
				}
				else
					System.out.println("��� �߰� ����");
				break;
			
			case 2:
				break;
			
			case 3:
				break;
			
			case 4:	
				break;
			
			case 5:
				if(data.size()==0)
				{
					System.out.println("��� ����.");
					break;
				}
				Iterator<Coffee> iter=data.iterator();
				printMember(iter);
				break;
			
			case 6:
				break;
			
			case 7:
				break;
			}
			
		}
		
		
	}
	 Coffee addCoffee()
		{
			System.out.print("�̸�: ");
			String name = sc.next();
			
			System.out.print("��ǥ: ");
			String brand = sc.next();
			
			sc.nextLine();
			
			System.out.print("����: ");
			int price = sc.nextInt();
			
			//System.out.println("�߰��Ǿ����ϴ�.");
			System.out.println("Ŀ�� : "+name+brand+price);
			return new Coffee(name, brand, price);
			
		}
	 
	 void printMember(Iterator<Coffee> iter)
	 {
		 while(iter.hasNext())
		 {
			 System.out.println(iter.next());
		 }
	 }
	 
	 
	
}

class Coffee
{
	private String name;
	private String brand;
	private int price;
	
	Coffee()
	{
		
	}
	
	Coffee(String name, String brand, int price)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "Member [name= "+name+", brand= "+brand+", price= "+price+"]";
	}
	
}