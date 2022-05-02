package StringClass;
import java.util.*;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-9));
		System.out.println(Math.ceil(4.2));
		System.out.println(Math.floor(4.9));
		System.out.println(Math.min(23, 67));
		System.out.println(Math.max(23, 67));
		System.out.println(Math.exp(23.4));
		System.out.println(Math.log(100));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.sin(30));
		System.out.println(Math.cos(30));
		System.out.println(Math.tan(30));
		
		StringBuilder str= new StringBuilder("Hello");
		StringBuilder rts=str.reverse();
		System.out.println("Hello를 거꾸로 쓰면"+rts+"와 같습니다.");
		
		
		System.out.println("정수를 2개 입력하시오.");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Math.min(a, b);
		
		System.out.println(a+"와"+b+"중 작은 쪽은"+c+"입니다.");
		
		

	}

}
