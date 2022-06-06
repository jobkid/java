package Java_Chapter_Array_5;

import java.util.Arrays;

public class ArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= {
							{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40}		
		};
		
		int sum=0;
		
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n",i, j, score[i][j]);
			}
		}
		
		for(int arr1[]:score)
		{
			System.out.println(Arrays.toString(arr1));
		}
		//System.out.println(Arrays.toString(score[1]));
		
		for(int i=0; i<score.length; i++) {
			
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];
			}
		}
		System.out.println(sum);
		
		char a=' ';
		int sum1=1;
		int [][] seat=new int[6][5];
		for(int i=0; i<seat.length; i++)
		{
			int j;
			for(j=0; j<seat[i].length; j++)
			{
				seat[i][j]=j+sum1;
			}
			char seatrow=(char)(i+65);
			//System.out.println(Arrays.toString(seat));
			System.out.println("==================");
			System.out.println(seatrow+Arrays.toString(seat[i]));
			
		}
		
		

	}

}
