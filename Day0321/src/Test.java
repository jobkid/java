import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int jumsu=sc.nextInt();
//		if(jumsu>=90)//90
//			{System.out.println("��");}
//		else if(jumsu>=90) {
//			System.out.println("��");}
//		else {
//			System.out.println("��");
			
//		}
		
		switch(jumsu){
		case 90:
			System.out.println("��");
		break;
		
		case 80:
			System.out.println("��");
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
