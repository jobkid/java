
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1���� 100���� ����Ͻÿ�.
		for (int i=1; i<101; i++) {
			System.out.println(i);
		}
		
//	1���� 10���� ���� ���Ͻÿ�.
		
		int sum=0;
		for(int j=0; j<11; j++)//z=1
		{
			
			sum=sum+j;
		}
		System.out.println(sum);
//	11���� 100������ ���� ���Ͻÿ�.
		int sum2=0;
		for(int k=0; k<101; k++) {
			sum2=sum2+k;
			
		}
		System.out.println(sum2);	
		
		
//	1���� 100���� ¦���� ���� ���Ͻÿ�.
		
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
		
//		1���� 100������ Ȧ���� ���Ͻÿ�.
		
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


