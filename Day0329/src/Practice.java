
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]gugudan=new int[2][9];
		int i = 0, j=0;
		for (int l=0; l<2;l++) {
			int s=l+2;
			for(int m=0; m<9; m++) {
				int t=m+1;
				
				gugudan[l][m]=s*t;
				System.out.print(gugudan[l][m]+"\t");
			}
			System.out.println();
		}	

	}

}
