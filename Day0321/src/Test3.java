
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, max=0;
		test:
			for(i=1; i<=5; i++)
			{
				max=i;
				j=1;
				while (true)
				{
					System.out.print(j+"\t");
					if(j==max)
					{
						System.out.println();
						continue test;
					}	
					j++;
					
				}
				
			}	
				
		
		
	}

}
