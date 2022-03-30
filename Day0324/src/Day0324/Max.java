
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= new int[] {15, 8, 26};
		//가장 큰 값을 출력하시오.
		int max=num[0];
		int min=num[0];	
		for (int i=0; i<3; i++)
			{
				if(max<num[i]) {
					max=num[i];
					
				}
				
				if(min>num[i])
				{
					min=num[i];
				}
					
				
				
			}
			System.out.println(max);
			System.out.println(min);
		
	}

}
