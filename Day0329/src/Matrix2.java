
public class Matrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			0	1	2	3	4(j)
 /* (i)	    1凯 2凯 3凯 4凯 5凯
	0	 *1青 1
	1	 *2青 2  3
	2	 *3青 4  5  6
	3	 *4青 7  8  9  10
	4	 *5青 11 12 13 14 15
		 */
		
//		int [][] mat=new int[5][5];
//		int num1=0, num2=0, num3=1;
//			
//		for(int i=0; i<5; i++){
//			num1=num1+num2*(num2-1);
//			for(int j=0; j<mat[i].length; j++) {
//									
//					System.out.print(mat[i][j]);	
//				}
//				System.out.println();
//			}
				
		int [][] num=new int[5][5];
			
		for(int i=0; i<5; i++){
			
			for(int j=0; j<i+1; j++) {
					num[i][j]=i+1;				
					System.out.print(num[i][j]);	
				}
				System.out.println();
			}
		
		
		

	}

}
