package exception;


public class ThrowExcMain {

	public static void main(String[] args) {
		
	 //throws NullPointerException, ArithmeticException, YourException {
		// TODO Auto-generated method stub
		
		ThrowExc te=new ThrowExc();//str, null
		//te.str="안녕하세요";
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
		super("크기는"+cnt+"이상이어야 합니다.");
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
			//throw new NullPointerException(); //예외 발생시키기
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