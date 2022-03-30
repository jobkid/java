import java.util.Scanner;
public class While_do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int i=0;
			do
			{
				System.out.println("1-10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
				num=sc.nextInt();
				if(num<=10 && num>0) {
					i++;//카운트를 할 변수를 따로 또 노력해야 한다.
					
				}
				
				else if(num==0) {
					
					System.out.println(i+"번 입력하였습니다.");
					break;
				}
				else {
					System.out.println("잘못된 입력입니다.");
//					System.out.println("1-10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
//					num=sc.nectInt();
				}
				
			}while(true);
			
		
		
	}

}
