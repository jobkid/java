package exception;
import java.io.IOException;

public class Iotest {

	public static void main(String[] args) throws IOException,ArithmeticException {
		// TODO Auto-generated method stub
		int ch=0;
		System.out.println("문자를 입력하세요.");
		//try
		{
			while (ch!='\n')//엔터를 입력하면 \r\n 값을 가지고 있음. \r→13 \n→10
			{
				ch=System.in.read();
				System.out.println((char)ch);//(char)
			}
		}
		/*catch(IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
	}

}
