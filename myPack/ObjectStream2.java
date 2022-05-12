package myPack;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ObjectStream2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String path = "src/myPack/MemData.ser";
		FileOutputStream fos = new FileOutputStream(path);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student("aaa", 56, 45, 34)); 
		al.add(new Student("bbb", 99, 87, 65));
		al.add(new Student("ccc", 32, 65, 89));
		//ArrayList에 Student 객체 추가
		
		for(int i=0; i<al.size(); i++)
		{
			Student s = al.get(i);
			
			s.eval_avg();
			oos.writeObject(s); //직렬화를 통해서 파일에 객체를 저장
			
		}
		 // Student 객체를 담은 객체 배열 변수 al도 직렬화
		//oos.writeObject(al);
		
		//이제 스트림에 담긴 데이터를 읽어서 개체를 만들 차례
		FileInputStream fis = new FileInputStream(path);//역직렬화 한다는 의미.
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s2; //Student 타입 변수 생성
		
		while((s2=(Student)ois.readObject())!=null)//스트림에 담긴 데이터를 Student로 형변환후 null값이 아닐 때까지
		{
			System.out.println(s2); //스트림에는 인스턴스 변수가 총 12개 담김.
			
			if(fis.available()==0)
			{
				break;
			}
		}
		oos.writeObject(al);//이것을 없애면 결국에 객체로 다시 돌릴 수 없음.
		//oos.writeObject(al);//ArrayList<Student> 직렬화 java:33
		
		
		//ois.readObject();
		ArrayList<Student> al2=(ArrayList<Student>)ois.readObject();
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
		sum=kor+eng+math;
	}
	void eval_avg()
	{
		avg = sum/3.0f;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + "]";
	}
}