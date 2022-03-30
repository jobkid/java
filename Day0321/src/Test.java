import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int jumsu=sc.nextInt();
//		if(jumsu>=90)//90
//			{System.out.println("수");}
//		else if(jumsu>=90) {
//			System.out.println("우");}
//		else {
//			System.out.println("가");
			
//		}
		
		switch(jumsu){
		case 90:
			System.out.println("수");
		break;
		
		case 80:
			System.out.println("우");
		break;
		
		default:
			System.out.println("default");
		}
		
		char ch='b';
		switch(ch)
		{
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		default:
			break;
			
			
		}
		
		
		boolean bFlag=true;
		
		
	}

}
