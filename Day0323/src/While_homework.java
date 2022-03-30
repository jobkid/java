import java.util.Scanner;
public class While_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1-10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
		Scanner sc = new Scanner(System.in);	
		
		while (true){
			
			int a = sc.nextInt();
			
				System.out.println(a+"번 입력하셨습니다.");
			
			if (a==0) {
				break;
			}
		}
		
	}

}