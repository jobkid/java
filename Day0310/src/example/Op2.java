package example;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=5;
		System.out.println(i++);//System.out.println(i);
		//i=i+1
		System.out.println(i++);//6¿¡¼­ 7
		System.out.println(i);
		System.out.println(j--);//System.out.println(j);
		//j=j+1;
		System.out.println(j);
		System.out.println("i="+i+",j="+j);
		System.out.println(i+"+"+j);
		
		System.out.println(++i);//i=i+1
								//System.out.println(i);
		System.out.println(--j);//j=j-1
								//System.out.println(j);
	}

}
