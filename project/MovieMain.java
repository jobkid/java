package project;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;

public class MovieMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		FileWriter fw = new FileWriter("src/project/c.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("이주협");
		
		FileWriter test = new FileWriter("src/project/test.txt");
		BufferedWriter testb =new BufferedWriter(test);
		testb.write("안녕하세요.");
		
		bw.close();
		testb.close();
		*/
		
		Maniger admin = new Maniger();
		admin.setMovie();
		

	}

}

class Maniger{
	
	Maniger(){
		
	}
	
	void setMovie() throws IOException{
		
		FileWriter movie = new FileWriter("src/project/movie.txt");
		BufferedWriter bw = new BufferedWriter(movie);
		
		System.out.println("영화 등록은 '1' 종료는 '0'");
		
		Scanner sc = new Scanner(System.in);
		int tmp=sc.nextInt();
		
		//int i=0;
		while (tmp==1){
			/*
			String title=sc.nextLine();
			String janre=sc.nextLine();
			String age=sc.nextLine();
			
			
			bw.write(title+", "+janre+", "+age);
			bw.newLine();
			*/
			
			//int exit=sc.nextInt();
			//int tmp1=sc.nextInt();
			System.out.println("영화 제목, 장르, 연령대 작성해주세요. 작성은 '1' 종료는 '0'");
			if(tmp==1)
			{
				Scanner moviesc = new Scanner(System.in);
				System.out.print("영화를 등록합니다.");
				String title=moviesc.nextLine();
				
				System.out.print("장르를 입력해주세요.");
				String janre=moviesc.nextLine();
				
				System.out.print("연령대를 입력해주세요.");
				String age=moviesc.nextLine();
			
				System.out.println("========================================");
				
				bw.write(title+", "+janre+", "+age);
				bw.newLine();
				
			
				
			}
			else if(tmp==0)
			{
				System.out.println("영화등록이 취소되었습니다.");
			}
			
			
			bw.close();
			movie.close();
			
			System.out.println("영화 등록 종료");
			
		}
		
		
		
		
		
	}
	
	void getMovie(){
		
	}
	
}