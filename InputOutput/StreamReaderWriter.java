package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("한글을 입력하고 엔터를 누르시오.");
		int ch = 0;
		
		try 
		{
			while((ch=System.in.read())!='\n')
			{
				System.out.print((char)ch);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("한글을 입력하고 엔터를 누르시오.");
		InputStreamReader isr = new InputStreamReader(System.in);//바이트로 읽은 데이터를
																//문자로 디토딩해주는 보조스트링
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream("src/InputOutput/ex.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		try 
		{
			while((ch=isr.read())!='\n')
			{
				System.out.print((char)ch);
				osw.write(ch);
			}
			osw.close();
			fos.close();
			
			isr.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
