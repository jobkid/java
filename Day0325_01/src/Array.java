
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		int[] arr2=arr1;
		
		int i;
		for (i=0; i<arr2.length; i++) {
			System.out.println("arr2[i]");
		}
		System.out.println("배열 arr1의 주소 (참조값)"+arr1);
		System.out.println("배결 arr2의 주소 (참조값)"+arr2);

	}

}
