package exception;

public class ArrayExcTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[3];//arr[0]=0, arr[1]=1, arr[2]=2
		int i;
		for(i=0;i<3;i++)//0,1,2
		{
			arr[i]=i;
		}
		
		try 
		{
			System.out.println("try블럭 시작");
			for(i=0; i<4;i++)//i=0,1,2,3
				{
				//System.out.println(arr[i]);
				}
			//i=4/0;
			String str=null;
			str.charAt(0);
			
			System.out.println("try블럭 끝");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array의 범위를 넘어서서 문제가 발새한 경우 이곳으로.");
			System.out.println(e.getMessage());
			//어떻게든 정상적으로 프로그램을 종료시키기 위한 코드.
			for(i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}
				
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눠서 예외가 발생함.");
			i=4/1;
			System.out.println("보완 완료");
		}
		catch(NullPointerException e)
		{
			System.out.println("문자열이 입력되지 않음.");
			
			System.out.println(e.getMessage());
			String str="안녕하세요";
			System.out.println(str);
			System.out.println("보완 완료");
		}
//		catch(Exception e)
//		{
//			System.out.println("Array, Arithmetic의 예외가 아닌 경우 이곳으로.");
//			System.out.println(e.getMessage());
//		}
		finally
		{
			System.out.println("finally블럭");
		}
		System.out.println("main()끝");
	}

}
