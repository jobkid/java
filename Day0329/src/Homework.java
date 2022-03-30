
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]num=new int[5][5];
		int i=0;
		for (int j=0; j<5; j++) {
			
			for(int k=0; k<5; k++) {
				i=i+1;
				num[j][k]=i;
				System.out.print(num[j][k]+"\t");
			}
			System.out.println();
		}
		
	}

}
