package pk04_2;

public class Chtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char aVar='A';
		System.out.println("aVar :"+aVar);
		System.out.println("aVar :"+(int)aVar);
		
		int result=((int)aVar+1);//B의 코드값.
		System.out.println((char)result);
		
		char aVar1='B';
		System.out.println("aVar1 :"+aVar1);
		System.out.println("aVar1 :"+(int)aVar1);
		
		int result1=((int)aVar+32);
		System.out.println((char)result1);
	}

}
