
public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int python, java, android, C2, c1;
		python =60;
		java =70;
		android=80;
		C2=50;
		c1=30;
		int sum=python+java+android+C2+c1;
		float avr=sum/5;
//		float avr=sum/5.0f;     int/float ->50
//		sum = sum +a
//		sum = sum+b
				
			System.out.println(sum);
			System.out.println(avr);
			
			//System.out.println("���߳��� ���� ���հ�� %d�Դϴ�. ����� %f�Դϴ�.", sum, avr);
			//���
			System.out.printf("���߳��� ���� ���հ�� %d �Դϴ�.����� %.1f �Դϴ�.", sum, avr);
		
		int a=6, b=5;
		float c=4;
		float d = a*b*c;
	}

}
