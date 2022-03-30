
public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		
		int[] arr2 = new int[4];
		arr2[0]=arr1[0];
		arr2[1]=arr1[1];
		arr2[2]=arr1[2];
		arr2[3]=10;
		
		for(int i =0; i<4; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
