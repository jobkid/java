
public class Matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][]mat=new int[5][5];
//		int m=0;
//		for(int i=0; i<5; i++) {
//			m=m+1;
//			for(int j=0; j<5; j++) {
//				mat[i][j]=m;
//				System.out.print(mat[i][j]+"\t");
//			}
//			System.out.println();
//		}
			
//		int[][]mat=new int[5][5];
//		int m=0;
//		for(int i=0; i<5; i++) {
//			m=m+1;
//			for(int j=0; j<5; j++) {
//				mat[i][j]=m;
//				System.out.print(mat[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		int[][]mat=new int[5][5];
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
					
					mat[i][j]=j+1;
					System.out.print(mat[i][j]+"\t");
					
			}
			System.out.println();
		}		
		

	}

}
