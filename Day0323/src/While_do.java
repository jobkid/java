import java.util.Scanner;
public class While_do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int i=0;
			do
			{
				System.out.println("1-10������ ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����մϴ�.");
				num=sc.nextInt();
				if(num<=10 && num>0) {
					i++;//ī��Ʈ�� �� ������ ���� �� ����ؾ� �Ѵ�.
					
				}
				
				else if(num==0) {
					
					System.out.println(i+"�� �Է��Ͽ����ϴ�.");
					break;
				}
				else {
					System.out.println("�߸��� �Է��Դϴ�.");
//					System.out.println("1-10������ ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����մϴ�.");
//					num=sc.nectInt();
				}
				
			}while(true);
			
		
		
	}

}
