import java.util.Scanner;
public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		if (score>=90) {
			System.out.println("수");
		}
		else if(score>80){
			System.out.println("우");
		}
		else if(score>=70) {
			System.out.println("미");
		}
		else if(score>=60){
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}
		if(score>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
			System.out.println("ㅠㅠ");
		}
		
		
		
		System.out.println("종료");
		
	}

}
