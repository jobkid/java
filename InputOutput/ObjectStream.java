package InputOutput;

import java.util.ArrayList;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student("aaa",56,34,63));
		al.add(new Student("bbb",34,32,34));
		al.add(new Student("ccc",34,26,35));
		
		String path = "src/InputOutput/MemData.ser";
		FileOutputStream fos = new FileOutputStream(path);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i=0; i<al.size(); i++)
		{
			Student s=al.get(i);
			
			s.eval_avg();
			oos.writeObject(s);
		}
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s2;
		
		while ((s2=(Student)ois.readObject())!=null)
		{
			System.out.println(s2);
			
			if(fis.available()==0)
			{
				break;
			}
		}
		
		oos.writeObject(al);
		ArrayList<Student> al2=(ArrayList<Student>) ois.readObject();
		System.out.println(al2);
		
		oos.close();
		
		ois.close();
		
		
		
	}

}

class Student implements Serializable
{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	
	Student()
	{
		
	}
	
	Student(String name, int kor, int eng, int math)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void eval_sum()
	{
		sum = kor + eng + math;
	}
	
	void eval_avg()
	{
		eval_sum();
		avg = sum/3.0f;
	}
	
	public String toString()
	{
		String str = "Student [ name = "+name+", "+"kor = "+", eng = "+eng+", math = "+math+",sum = "+sum+", avg="+avg+"]";
		return str;
	}
}