
public class For_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� 1
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
		System.out.println();

		//		���� 2
		for(int i=0; i<6; i++) {
			System.out.println("sum = sum + a["+i+"]");
		}
		System.out.println();
//		
////		int sum=0;
//		int [] a ;
//		for (int i=0; i<0; i++) {
////			sum=sum+a[i];
//			System.out.println(sum);
//		}
//		

		//		����3
		
		for(int i=0; i<4; i++) {
			int num[]=new int[] {10,100,1000,10000};
				System.out.println("num["+(i+1)+"]="+num[i]);
		}
		System.out.println();
		
		

		//		����4
		for(byte i=0; i<6; i++) {
			byte numb[]= {1,1,1,1,1,1};
			System.out.println("numb["+(i)+"]="+numb[i]);
		}
		System.out.println();

		//		����5
		for(byte i=0; i<6; i++) {
			byte number[]= {1,2,3,4,5,6};
			System.out.println("number["+(i)+"]="+number[i]);
		}
		System.out.println();
		
//		����6
		for(byte i=0; i<6; i++) {
			System.out.println("numbe["+i+"]="+((2*i)+1));
		}
		System.out.println();
		
//		����7
		for(byte i=0; i<6; i++) {
			System.out.println("nu["+i+"]="+((10*i)+10));
		}
		System.out.println();

		//����8
		for(byte i=0; i<10; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println("n["+i+"]="+(i*i));
		}
		System.out.println();
		
		//����9
		int sum=0;
		for(int i=1; i<101; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println();
		
		//����10
		int [] a1= {2,10,8,5,3,9};
		int sum1=0;
		for (int i=0; i<6; i++) {
			sum1=sum1+a1[i];
		}
		System.out.println(sum1);
		
//		����11
		char [] ch= {'a','p','p','l','e'};
		for (int i=0; i<5; i++) {
			System.out.println(ch[i]);
		}
		
		for (int i=4; i>-1; i--) {
			System.out.println(ch[i]);
		}
		
//		����12
		int[] arr;
		arr=new int[10];
		for (int i=0; i<10; i++) {
			
		}
		
		int[] b;//���� ����Ÿ��.
		
		
		
	}		
}
