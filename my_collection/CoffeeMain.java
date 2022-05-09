package my_collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class CoffeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//커피 관리 프로그램
		//가격만 수정할 수 있다.
		//커피이름으로 검색하고, 수정하고, 삭제 가능.
		
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
	private String menuStr = "1. 추가 2. 검색 3. 수정 5. 삭제 5. 전체출력 6. 데이터 초기화 7 종료";
	
	public void menuProcess(ArrayList<Coffee> data)
	{
		//System.out.println("1. 추가 2. 검색 3. 수정 4. 삭제 5. 전체출력 6. 데이터 초기화 7. 종료");
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
					System.out.println("커피를 추가했습니다.");
				}
				else
					System.out.println("멤버 추가 실패");
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
					System.out.println("멤버 없음.");
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
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("상표: ");
			String brand = sc.next();
			
			sc.nextLine();
			
			System.out.print("가격: ");
			int price = sc.nextInt();
			
			//System.out.println("추가되었습니다.");
			System.out.println("커피 : "+name+brand+price);
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