package example;

public class Typemismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=13;
		float c=0;
		//�ڵ� ����ȯ
		//�º��� float, �캯�� int
		//�캯 ��� ��� (int)�� float���� ��ȯ�Ǿ� �º� c�� ����
		c=(a+b)/(float)2;
		System.out.println("a�� b�� ����� "+c+"�̴�.");
		float f=12.5f;
		//��������ȯ
		a=(int)f;
		System.out.println("a= "+a);
		
		
		char c1='A';
		System.out.println(c1);
		//char c2=c1+1;
		char c2= (char)(c1+1);
		System.out.println(c2);
	}

}
