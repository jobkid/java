package exception;
import java.io.IOException;

public class Iotest {

	public static void main(String[] args) throws IOException,ArithmeticException {
		// TODO Auto-generated method stub
		int ch=0;
		System.out.println("���ڸ� �Է��ϼ���.");
		//try
		{
			while (ch!='\n')//���͸� �Է��ϸ� \r\n ���� ������ ����. \r��13 \n��10
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
