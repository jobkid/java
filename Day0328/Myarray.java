
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
		
		int [][] stu = {{100, 50, 20},//��
						{10, 40, 80}};//��
		stu[1][1]=90;
		System.out.println(stu[1][1]);
		
		/*Ű, �Ź߻�����, ������
		//a 10��
		//a�� 10��;
		int [] a;
				a=new int[9];
		a[9]=10;*/
		
		/*int [][] a = new int[9][3];
		a[0][0]=100;
		a[1][1]=50;
		System.out.println(a[0][0]);*/
		
		//int[][] a;//int�� �迭�� �迭 Ÿ��
		//a[0][0]=0;//���� �� ����. //���α׷� ����
		//a[0][1]=1;
		//a[0][2]=2;
		
//		for(int i=0; i<2; i++) {
//			for(int j = 0; j<3; j++) {
//				int[][] a= new int[i][j];
//			
//			}
		int[][]a;//�迭 ����
//		�޸� �Ҵ�
			a=new int[10][3];
				for(int i = 0; i<10; i++)//��
				{
					for(int j=0; j<3; j++)//��
					{
					a[i][j]=j;	//���Ҵ�
					System.out.println(a[i][j]);
					}
							
			}
			
				
				
		//���Ӱ� �Ѱ�
			
//			int [][]a;//
//			a=new int[2][];
//			for(int j =0; j<3;j++) {
				
//			}
			
//			�迭 2���� ����ؼ� �� ���
//			char�� 2�����迭
//			a ppl e/ 0��
//			l emo n/ 1��
//			0��	...4��
//			//�� ���� ��� ������ �ۼ��Ͻÿ�. //��������, �޸� �Ҵ�, �� �Ҵ�
				
			 //�迭 ����
//			�޸� �Ҵ�
//			char [][] b= {{'a','p','p','p','p'},{'l','e','m','o','n'}};
//				for (k=0; k<3; k++)
//				{
					
//				}

				
				char[][] fruit;//���� ����//������ Ÿ��<---����Ÿ��, �ּҰ�, 4byte
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
