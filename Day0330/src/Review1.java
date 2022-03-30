import java.util.Scanner;
public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[]arr;
		arr=new int[10];
		
		int[] Arr=new int[10];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		int j=0;
		for(int i=0;i<10;i++){
			j=j+1;
			arr[i]=j;
			System.out.print(arr[i]+"\t");
		}*/
		
		/*int[][]arr=new int[2][3];
		System.out.println(arr.length);
		
		int [][] arr2=new int[5][7];
		System.out.println(arr2.length);
		
		//배열 arr3[2].lenghth는?
		int[][] arr3=new int[8][3];
		System.out.println(arr3.length);*/
		
		Scanner sc= new Scanner(System.in);
		/*int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int num5=sc.nextInt();*/
		
//		String str=sc.nextLine();
//		System.out.print(str);
//		System.out.print(str);
		
		/*int [] Num=new int[5];
		
			for (int i=0; i<5; i++) {
				
				Num[i]= sc.nextInt();
				
				System.out.print(Num[i]);
				
			}
			System.out.println();
		
		int[] Num1=new int[1];
		Num1[0]=Num[0];
		Num[0]=Num[1];
		Num[1]=Num1[0];	
		System.out.println(Num[0]);
		System.out.println(Num[1]);
		/*Num[0]=Num[1];
		Num[1]=Num[0];
		System.out.println(Nu);*/	

//			String str=sc.next();
//			System.out.print(str);
		
		//배열 10개를 저장(1~10까지의 랜덤한 수를 구해 저장)해두고, 검색할 숫자를 입력하여 찾는 프로그램(LinerSearch 프로그램)
		
		
		int [] Num2=new int[10];
		System.out.println("검색할 값(1~10)을 입력하시오.");
		int number=sc.nextInt();
	
		
		for(int i=0; i<10; i++) {
			Num2[i]=number;
			number=(int)(Math.random()*10)+1;
			System.out.print(Num2[i]);	
			
		}
		
		
			
	}
	
}
