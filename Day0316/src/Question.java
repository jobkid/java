
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� �������ִ� �ܰ踦(������)�̶�� �Ѵ�. �����Ϸ��� �� ���� �������ش�.
		//java�� ���α׷� �ҽ��� ������ �� ������� (class)������ ������ �������, JVM�� �ؼ��ؼ� ������ �� �ֵ��� �Ѵ�.
		/*�ڹ� ����ȯ�� �����ÿ� ���α׷� ��������(��Ŭ����)�� ����ϰ� ���� ȯ��, 
		 * �����Ϸ�, JVM, ����� �� ���߿� �ʿ��� ������ (jdk)�� ��ġ�Ѵ�.
		 */
		//���α׷��� �ۼ��ϰ� �Ĥ����� �� ����� ����Ͻÿ�.
		System.out.println("Hello Java!");
	
	int abc;
	int Abc;
	int $num;
	int data_nume;
		System.out.println();
		//���α׷��� �ۼ��ϰ� ������ �� ����� ����Ͻÿ�.
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
	
	//���α׷��� �ۼ��ϰ� ������ �� ����� ����Ͻÿ�.
	//byte aVar =100;
	//short bVar=30000;
	int cVar=50000;
	long dVar=1000000;
		//System.out.println("byte Ÿ�� : "+aVar);
		//System.out.println("shoort Ÿ�� : "+bVar);
		System.out.println("int Ÿ�� : "+cVar);
		System.out.println("long Ÿ�� : "+dVar);
	
	//���α׷��� �ۼ��ϰ� ������ �� ����� ����Ͻÿ�.
	//float aVar;
	double bVar;
	
	//aVal=10.2;
	//aVar=20.1f;
	bVar=20.1;
		//System.out.println("float Ÿ�� : "+aVar);
		System.out.println("double Ÿ�� : "+bVar);
	
	//���α׷��� �ۼ��ϰ� ������ �� ��°���� Ȯ���Ͻÿ�.
	char aVar='A';
		System.out.println("aVar : "+aVar);
		System.out.println("aVar : "+(int)aVar);
	
	//�Ʒ��� ���� ����, �Ҵ��Ͽ���. �ùٸ��� ǥ���ϰ�, �ùٸ��� �ʴٸ� �����϶�.
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
	
	//���α׷��� �ۼ��ϰ� ������ �� ��°���� Ȯ���Ͻÿ�
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
	
//	���α׷��� �ۼ��ϰ� ������ �� ��� ����� Ȯ���Ͻÿ�
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
			System.out.println("���� i="+i);
			System.out.println("i++ : "+i++);
			System.out.println("++i : "+(++i));
			System.out.println("i-- : "+i--);
			System.out.println("--i : "+(--i));
			
		
	}

}
