import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("���� 97���� 122���̸� �Է��ϼ���. a=97, z=122�Դϴ�.");
		int value =sc.nextInt();
		char value2=(char)value;
		if(value>=97&&value<=122) {
			
			System.out.println(value2);
			System.out.println((char)(value2-32));
		}//97���� 122������ ���ڸ� �Է� �� �ҹ��ڷ� ��ȯ. �ҹ��� ��ȯ �� 32�� ���� ��.
		
		
		else {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
			
		}
		
		
			
		Scanner SC= new Scanner(System.in);
		//int inputData=sc.nextInt();
		SC.next();//"koheeseon"
		String str=SC.next();//"abc"
		char ch =str.charAt(0);//'a'
			System.out.println((char)(ch-32));
			
		
	}

}
