
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기계어로 번역해주는 단계를(컴파일)이라고 한다. 컴파일러가 그 일을 수행해준다.
		//java의 프로그램 소스는 컴파일 후 결과물이 (class)형태의 파일이 만들어져, JVM이 해석해서 실행할 수 있도록 한다.
		/*자바 개발환경 구성시에 프로그램 편집툴로(이클립스)를 사용하고 개발 환경, 
		 * 컴파일러, JVM, 디버거 등 개발에 필요한 도구인 (jdk)를 설치한다.
		 */
		//프로그램을 작성하고 컴ㅂ파일 후 결과를 출력하시오.
		System.out.println("Hello Java!");
	
	int abc;
	int Abc;
	int $num;
	int data_nume;
		System.out.println();
		//프로그램을 작성하고 컴파일 후 결과를 출력하시오.
//	boolean a = true;
//	byte b=10;
//	short c=20;
	int d=30;
	long e=40L;
	float f =12.5f;
	double g=34.56;
	char h ='k';
//	String i ="hello java";
//		System.out.println("boolean : "+a);
//		System.out.println("byte : "+b);
//		System.out.println("short : "+c);
		System.out.println("int : "+d);
		System.out.println("long : "+e);
		System.out.println("float : "+f);
		System.out.println("double : "+g);
		System.out.println("char : "+h);
//		System.out.println("String : "+i);
	
	//프로그램을 작성하고 컴파일 후 결과를 출력하시오.
	//byte aVar =100;
	//short bVar=30000;
	int cVar=50000;
	long dVar=1000000;
		//System.out.println("byte 타입 : "+aVar);
		//System.out.println("shoort 타입 : "+bVar);
		System.out.println("int 타입 : "+cVar);
		System.out.println("long 타입 : "+dVar);
	
	//프로그램을 작성하고 컴파일 후 결과를 출력하시오.
	//float aVar;
	double bVar;
	
	//aVal=10.2;
	//aVar=20.1f;
	bVar=20.1;
		//System.out.println("float 타입 : "+aVar);
		System.out.println("double 타입 : "+bVar);
	
	//프로그램을 작성하고 컴파일 후 출력결과를 확인하시오.
	char aVar='A';
		System.out.println("aVar : "+aVar);
		System.out.println("aVar : "+(int)aVar);
	
	//아래와 같이 선언, 할다하였다. 올바른지 표기하고, 올바르지 않다면 수정하라.
	short num = 128;
	char capitar = 'A';
	char upperChar = 65;
	float var=3.14f;
	double var2 = var;
	boolean ret=false;
		System.out.println(num);
		System.out.println(capitar);
		System.out.println(upperChar);
		System.out.println(var);
		System.out.println(var2);
		System.out.println(ret);
	
	//프로그램을 작성하고 컴파일 후 출력결과를 확인하시오
	int a=20, b=10, c=0;	
	c=a+b;
		System.out.println(c);
	c=a-10;
		System.out.println(c);
	c=a*b;
		System.out.println(c);
	c=a/b;
		System.out.println(c);
	c=a%b;
		System.out.println(c);
	c=12%5;
		System.out.println(c);
	
//	프로그램을 작성하고 컴파일 후 출력 결과를 확인하시오
//		int i=5, j=5;
//			System.out.println(i++);
//			System.out.println(j--);
//			System.out.println("i="+i+", j="+j);			
		int i=5,j;
		j=i++;
			System.out.println("j="+j);
		j=++i;
			System.out.println("j="+j);
		j=i--;
			System.out.println("j="+j);
		j=--i;
			System.out.println("j="+j);
			System.out.println("현재 i="+i);
			System.out.println("i++ : "+i++);
			System.out.println("++i : "+(++i));
			System.out.println("i-- : "+i--);
			System.out.println("--i : "+(--i));
			
		
	}

}
