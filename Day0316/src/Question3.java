
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Ʒ��� ���� �����Ͽ�(������ �ִٸ� ���������Ͽ�) 'e'�� ���ڸ� ����� �� �ְ� �ڵ带 �ϼ��Ͻÿ�
//		d���� �����ڵ�
//		char b ='d'
//		char c = b+1
		char b='d';
		char c='d'+1;
			System.out.println((int)'d');
			System.out.println(b);
			System.out.println(c);
//		�ҹ��� 'y'�� ������ �Ҵ��ϰ�, �빮�� 'Y'�� ����� �� �ֵ��� ���α׷� �ۼ�
		
		char a='y'; 
			System.out.println((int)a);//y�� int�� ���� �� �˾ƺ��� 121
		char A='Y';	
			System.out.println((int)A);//Y�� int���� ������ �˾ƺ���89
			//121-89=32
			System.out.println((char)(a-32));
		
		char D='R';
			System.out.println((int)D);
		char d='r';
			System.out.println((int)d);
			//82+32=114
			System.out.println((char)(D+32));
		
		
	}

}
