//int x=2에서 x의 값이 짝수 인지 홀수 인지 판단하는 프로그램을 작성하시오.
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if (x%2==0) {
			System.out.println("x는 짝수");
			
		}
		else if(x%2==1) {
			System.out.println("x는 홀수");	
		}

	}

}
