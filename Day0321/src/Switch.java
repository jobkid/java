
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		switch(a)
		{
		case 10:
			System.out.println("10�̴�.");
			break;
			
		case 20:
			System.out.println("20�̴�.");
			
		
		case 30:
			System.out.println("30�̴�.");
			break;
			
		default:
			System.out.println("�� �̿��� ��");
			break;
		}
		
		if(a==10) {
			System.out.println("10�̴�");
		}
		else if(a==20){
			System.out.println("20�̴�");
		}
		else if(a==30) {
			System.out.println("�� �̿��� ��.");
		}		
		
	}

}
