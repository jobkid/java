package example;

public class Typemismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=13;
		float c=0;
		//자동 형변환
		//좌변은 float, 우변은 int
		//우변 계산 결과 (int)가 float으로 변환되어 좌변 c에 저장
		c=(a+b)/(float)2;
		System.out.println("a와 b의 평균은 "+c+"이다.");
		float f=12.5f;
		//강제형변환
		a=(int)f;
		System.out.println("a= "+a);
		
		
		char c1='A';
		System.out.println(c1);
		//char c2=c1+1;
		char c2= (char)(c1+1);
		System.out.println(c2);
	}

}
