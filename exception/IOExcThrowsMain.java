package exception;
import java.io.IOException;

public class IOExcThrowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOExcThrows io=new IOExcThrows();
		try
		{
			io.input();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		io.print();

	}

}

class IOExcThrows
{
	char[]arr=new char[10];
	int i=0;
	
	void input() throws IOException, ArithmeticException
	{
		while (true)//«—¡Ÿ∑Œ while((arr[i++]=(char)System.in.read())!='\n')
		{
			arr[i]=(char)System.in.read();
			i++;
			if(arr[i]=='\n')
			{
				break;
			}
			i++;
		}
	}
	void print()
	{
		int j=0;
		while(j<i)
		{
			System.out.println(arr[j]);
			j++;
		}
	}
}