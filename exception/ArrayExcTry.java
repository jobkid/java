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
			System.out.println("try�� ����");
			for(i=0; i<4;i++)//i=0,1,2,3
				{
				//System.out.println(arr[i]);
				}
			//i=4/0;
			String str=null;
			str.charAt(0);
			
			System.out.println("try�� ��");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array�� ������ �Ѿ�� ������ �߻��� ��� �̰�����.");
			System.out.println(e.getMessage());
			//��Ե� ���������� ���α׷��� �����Ű�� ���� �ڵ�.
			for(i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}
				
		}
		catch(ArithmeticException e)
		{
			System.out.println("0���� ������ ���ܰ� �߻���.");
			i=4/1;
			System.out.println("���� �Ϸ�");
		}
		catch(NullPointerException e)
		{
			System.out.println("���ڿ��� �Էµ��� ����.");
			
			System.out.println(e.getMessage());
			String str="�ȳ��ϼ���";
			System.out.println(str);
			System.out.println("���� �Ϸ�");
		}
//		catch(Exception e)
//		{
//			System.out.println("Array, Arithmetic�� ���ܰ� �ƴ� ��� �̰�����.");
//			System.out.println(e.getMessage());
//		}
		finally
		{
			System.out.println("finally��");
		}
		System.out.println("main()��");
	}

}
