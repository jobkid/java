
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		switch(a)
		{
		case 10:
			System.out.println("10이다.");
			break;
			
		case 20:
			System.out.println("20이다.");
			
		
		case 30:
			System.out.println("30이다.");
			break;
			
		default:
			System.out.println("그 이외의 값");
			break;
		}
		
		if(a==10) {
			System.out.println("10이다");
		}
		else if(a==20){
			System.out.println("20이다");
		}
		else if(a==30) {
			System.out.println("그 이외의 값.");
		}		
		
	}

}
