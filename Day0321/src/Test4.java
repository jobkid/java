
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1부터 100까지 출력하시오.
		for (int i=1; i<101; i++) {
			System.out.println(i);
		}
		
//	1부터 10까지 합을 구하시오.
		
		int sum=0;
		for(int j=0; j<11; j++)//z=1
		{
			
			sum=sum+j;
		}
		System.out.println(sum);
//	11부터 100까지의 합을 구하시오.
		int sum2=0;
		for(int k=0; k<101; k++) {
			sum2=sum2+k;
			
		}
		System.out.println(sum2);	
		
		
//	1부터 100까지 짝수의 합을 구하시오.
		
		int sum3=0;
		for(int l=0; l<101; l++) {
			if(l%2==0) {
				sum3=sum3+l;	
			}
			
		}
		System.out.println(sum3);
		
//		int sum4=0;
//		for(int n=0; n<101; n++) {
//			
//			sum4=sum4+n;
//			
//		}	
//		
		
//		1부터 100까지의 홀수를 구하시오.
		
		for(int m=0; m<101; m++){
			if(m%2==1) {
				System.out.print(m+"\t");
			
			}							
			
			if(m%10==0)	{
				System.out.println();
				
			}
		}
		
			
		}
		
	}


