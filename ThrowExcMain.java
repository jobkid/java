package exception;


public class ThrowExcMain {

	public static void main(String[] args) {
		
	 //throws NullPointerException, ArithmeticException, YourException {
		// TODO Auto-generated method stub
		
		ThrowExc te=new ThrowExc();//str, null
		//te.str="�ȳ��ϼ���";
		//te.str="iotiot";
		//String str=te.str;
		try {
		String str=te.subStr(2);
		
		System.out.println(str);
		//System.out.println(str2);
		}
		catch(YourException e){
			e.printStackTrace();
		}
		
		
		

	}

}
class YourException extends Exception
{
	int cnt;
	YourException(int cnt)
	{
		super("ũ���"+cnt+"�̻��̾�� �մϴ�.");
	}
}

class ThrowExc
{
	String str=null;
	public String subStr(int idx) throws YourException, NullPointerException, ArithmeticException
	{
		if(str==null)
		{
			System.out.println("str is null");
			//throw new NullPointerException(); //���� �߻���Ű��
			//throw new ArithmeticException();
			//try
			//{
				throw new YourException(6);
			//}
			//catch(YourException e)
			//{
			//	e.printStackTrace();
			//}
		}
		else
			return str.substring(idx);
		
	}
}