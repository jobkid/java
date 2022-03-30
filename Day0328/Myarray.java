
public class Myarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		int[][] stu;
		
//		stu = new int[2][];
//		stu[0] = new int[3];
//		stu[1] = new int[3];
		
//		int[][] stu = new int [2][3];
//		stu[0][0] = 100;
//		stu[0][1] = 50;
//		stu[0][2] = 20;
		
		int [][] stu = {{100, 50, 20},//행
						{10, 40, 80}};//열
		stu[1][1]=90;
		System.out.println(stu[1][1]);
		
		/*키, 신발사이즈, 형제수
		//a 10개
		//a가 10개;
		int [] a;
				a=new int[9];
		a[9]=10;*/
		
		/*int [][] a = new int[9][3];
		a[0][0]=100;
		a[1][1]=50;
		System.out.println(a[0][0]);*/
		
		//int[][] a;//int의 배열의 배열 타입
		//a[0][0]=0;//담을 수 없다. //프로그램 종료
		//a[0][1]=1;
		//a[0][2]=2;
		
//		for(int i=0; i<2; i++) {
//			for(int j = 0; j<3; j++) {
//				int[][] a= new int[i][j];
//			
//			}
		int[][]a;//배열 선언
//		메모리 할당
			a=new int[10][3];
				for(int i = 0; i<10; i++)//행
				{
					for(int j=0; j<3; j++)//열
					{
					a[i][j]=j;	//값할당
					System.out.println(a[i][j]);
					}
							
			}
			
				
				
		//새롭게 한거
			
//			int [][]a;//
//			a=new int[2][];
//			for(int j =0; j<3;j++) {
				
//			}
			
//			배열 2차원 사용해서 값 담기
//			char의 2차원배열
//			a ppl e/ 0행
//			l emo n/ 1행
//			0열	...4열
//			//의 값을 담는 구문을 작성하시오. //변수선언, 메모리 할당, 값 할당
				
			 //배열 선언
//			메모리 할당
//			char [][] b= {{'a','p','p','p','p'},{'l','e','m','o','n'}};
//				for (k=0; k<3; k++)
//				{
					
//				}

				
				char[][] fruit;//변수 선언//데이터 타입<---참조타입, 주소값, 4byte
				fruit = new char[2][5];
				fruit[0][0]='a';
				fruit[0][1]='p';
				fruit[0][2]='p';
				fruit[0][3]='l';
				fruit[0][4]='e';
				fruit[1][0]='l';
				fruit[1][1]='e';
				fruit[1][2]='m';
				fruit[1][3]='o';
				fruit[1][4]='n';
				
				
				int [][] multi;
				multi=new int [8][9];
				for(int l=0; l<8; l++)
				{
					int s=l+2;
					for(int m=0; m<9; m++)
					{
						int t=m+1;
						int c=multi[l][m]=s*t;
						System.out.print(c+"\t");			
					}
						
					System.out.println();
				}

				
				int [][]num;
				int f=0;
				num=new int[5][5];
				for(int a1=0; a1<5; a1++)
				{
					int c1=a1+1;
					for(int b1=0; b1<5; b1++)
					{
						int d1=b1+1;
						int e=num[a1][b1]=f+1;
						System.out.println(e+"\t");
					}
					System.out.println();
				}
				
					
	}

}
