import java.util.Scanner;
public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;//3,4
		Scanner sc= new Scanner(System.in);
		System.out.println("성별을 입력하세요");
		int gender=sc.nextInt();
		//gender가 3인 경우 "남자"로 출력
		//gender가 4인 경우 "여자"로 출력
		if (gender == 2 || gender ==4)//조건만족
		{
			System.out.println("여자");
		}
//		if (gender%2==0)
		else if (gender==1||gender==3)
		{
			System.out.println("남자");
		}
//		else if(gender%2==1)
		else
		{
			System.out.println("잘못 입력");
			}
		}
		
	}
