
public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int python, java, android, C2, c1;
		python =60;
		java =70;
		android=80;
		C2=50;
		c1=30;
		int sum=python+java+android+C2+c1;
		float avr=sum/5;
//		float avr=sum/5.0f;     int/float ->50
//		sum = sum +a
//		sum = sum+b
				
			System.out.println(sum);
			System.out.println(avr);
			
			//System.out.println("나잘난의 성적 총합계는 %d입니다. 평균은 %f입니다.", sum, avr);
			//출력
			System.out.printf("나잘난의 성적 총합계는 %d 입니다.평균은 %.1f 입니다.", sum, avr);
		
		int a=6, b=5;
		float c=4;
		float d = a*b*c;
	}

}
