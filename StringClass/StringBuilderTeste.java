package StringClass;
import java.util.Scanner;

public class StringBuilderTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String e="��浿";
		System.out.println(e.substring(0,2));
		StringBuilder e2=new StringBuilder("��浿");
		
		
		e2.append("����");
		System.out.println(e2);*/
		
		Scanner sc= new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		int i;
		for(i=0; i<3; i++)
		{
			System.out.println("�ܾ �Է��϶�");
			sb.append(sc.nextLine());
		}
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.delete(3, 5);
		System.out.println(sb);
		
		sb.insert(3, "xxx");
		System.out.println(sb);
		
		sb.replace(3, 5, "yyyy");
		System.out.println(sb);

	}

}
