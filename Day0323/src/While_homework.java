import java.util.Scanner;
public class While_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1-10������ ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����մϴ�.");
		Scanner sc = new Scanner(System.in);	
		
		while (true){
			
			int a = sc.nextInt();
			
				System.out.println(a+"�� �Է��ϼ̽��ϴ�.");
			
			if (a==0) {
				break;
			}
		}
		
	}

}