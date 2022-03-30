import java.util.Scanner;
public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int A1=sc.nextInt();
		int A2=sc.nextInt();
		int A3=sc.nextInt();
		int B1=sc.nextInt();
		int B2=sc.nextInt();
		int B3=sc.nextInt();
		int C1=sc.nextInt();
		int C2=sc.nextInt();
		int C3=sc.nextInt();
		
		
		int Score[]= {A1, A2, A3, B1, B2, B3, C1, C2, C3};
		
		for(int i=0; i<9; i++) {
			System.out.print(Score[i]+"\t");
		}
		System.out.println();
		
		int [][] Student=new int[3][3];
		
		for (int j=0; j<3; j++) {
			
			for(int k=0; k<3; k++) {
				for(int i =0; i<3; i++) {
					Student[j][k]= Score[i];
					i=i+2;
					
				}
				System.out.print(Student[j][k]);
			}
		}
		
		
		
	}

}
