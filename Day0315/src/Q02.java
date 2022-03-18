import java.util.Scanner;
public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요");
		Scanner score1=new Scanner(System.in);
		Scanner score2=new Scanner(System.in);
		Scanner score3=new Scanner(System.in);
		Scanner score4=new Scanner(System.in);
		Scanner score5=new Scanner(System.in);
		int python=score1.nextInt();
		int android=score2.nextInt();
		int java=score3.nextInt();
		int C1=score4.nextInt();
		int c2=score5.nextInt();
		int sum = python+java+android+C1+c2;
		float avr = (python+java+android+C1+c2)/5;
		
		System.out.printf("나잘난의 성적 총합계는 %d 입니다.평균은 %f 입니다.", sum, avr);
	}

}
