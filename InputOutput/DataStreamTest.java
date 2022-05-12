package InputOutput;

import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "src/InputOutput/data.dat";
		
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dout = new DataOutputStream(fos);
		
		dout.writeInt(1);
		dout.writeByte(2);
		dout.writeShort(3);
		dout.writeBoolean(true);
		dout.writeChar('C');
		dout.writeFloat(3.23f);
		dout.writeDouble(234.567);
		
		FileInputStream fis = new FileInputStream(path);
		DataInputStream din = new DataInputStream(fis);
		
		System.out.println(din.readInt());
		System.out.println(din.readByte());
		System.out.println(din.readShort());
		System.out.println(din.readBoolean());
		System.out.println(din.readChar());
		System.out.println(din.readFloat());
		System.out.println(din.readDouble());
		
		

	}

}
