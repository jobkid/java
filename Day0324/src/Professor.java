
public class Professor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num =new int[5];
		int j=1;
		for(int i=1;i<5; i++) {
			j=j*10;
			num[i]=j;
			System.out.println(num[i]);
		}
	
		
		int[]num2 = new int[10];
		int j2 = 1;
		int sum=0;
		for(int i=0; i<10;i++) {
			num2[i]=j2;
			System.out.println(j2);
			j2=j2*10;
			sum=sum+num2[i];
			
			
		}
		System.out.println(sum);
		
		if(num[0]>num[1]) {
			System.out.println(0);
		}
		
		else if(num2[0]==num2[1]) {
			System.out.println("같은 경우");
		}
		else {
			System.out.println(1);
		}
		
		
//		1, 10, 100, 1000....
//		int idx=0;
//		int max=-1; //배열의 첫번째 값을 max로 할당
//		for (int i=0; i<10; i++)  {
//			if(num2[i]>max) {
//				max=num2[i];//1>-1 만족하면 max=1
//				idx = i;//max를 갱신하면 첨자를 백업해두자.
//			}
//			
//			else {
////				max의 값이 최대값이 맞아서 max의 값을 갱신하지 않음.
////				-1>-2
//			}
			
			
//		max값 구하기
		
		int [] num3=new int[2];
		int a=10;
		int b=15;
		int max1=-1;
		
		if(a>max1){
			max1=a;
			System.out.println(max1);
		}
		if(b>max1){
			max1=b;
			System.out.println(max1);
		}
		
		int[] num4=new int[] {5,8,2};
		int max3=num4[0];//5
		for (int i=0; i<3; i++)//0
		{	
			if(num4[i]>max3) // max인 줄 알았는데 배열 안에 값이 더 큼 5>5, 8>5
			{
				max3=num3[i];
				System.out.println(max3);
			}
			else {
				
			}
			
		}
		
		
		
		
	}

}
