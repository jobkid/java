//정수를 입력 받아, 절대값을 표시해주는 프로그램을 작성하라(삼항 연산자를 사용하여 작성하시오.)
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x =sc.nextInt();
		if (x>0) {
			System.out.println(x*1);
		}
		else if (x<0) {
			System.out.println(x*-1);
			
		}
	
	}

}
