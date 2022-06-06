package project;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

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
		
		Manager admin = new Manager();
//		admin.getMovie();
		System.out.println("=================");
		admin.movieList();
		System.out.println("================");
		admin.addMovie();
		
	}

}

class Manager{
	
	String fileName="";
	Manager(){
		
	}
	
	public void setMovie() throws IOException{
		
		FileWriter movie = new FileWriter("src/project/movie.txt");
		BufferedWriter bw = new BufferedWriter(movie);
		
		//System.out.println("영화 등록은 '1' 종료는 '0'");
		//System.out.println("영화 제목, 장르, 연령대를 5번 작성해주세요. 작성은 '1' 종료는 '0'");
		//Scanner sc = new Scanner(System.in);
		//int tmp=sc.nextInt();
		
		int i=5;
		while (i>0){
			System.out.println("영화 제목, 장르, 연령대를 5번 작성해주세요. 현재 "+i+"번 남았습니다. 작성은 '1' 종료는 '0'");
			
			Scanner sc = new Scanner(System.in);
			int tmp=sc.nextInt();
			if(tmp==1)
			{
				
				
				Scanner moviesc = new Scanner(System.in);
				
				System.out.print("영화를 등록합니다.");
				String title=moviesc.nextLine();
				
				System.out.print("장르를 입력해주세요.");
				String genre=moviesc.nextLine();
				
				System.out.print("연령대를 입력해주세요.");
				String age=moviesc.nextLine();
			
				System.out.println("========================================");
				
				
				bw.write(System.currentTimeMillis()+", "+title+", "+genre+", "+age);
				bw.newLine();
			}
			else if(tmp==0)
			{
				System.out.println("영화등록이 취소되었습니다.");
			}
			i--;
		}
		bw.close();
		movie.close();
		
		System.out.println("영화 등록 종료");

	}
	
	void getMovie() throws IOException
	{
		setMovie();
//		FileReader movies=new FileReader("src/project/movie.txt");
//		BufferedReader br=new BufferedReader(movies);
//		
//		br.close();
//		movies.close();
	}
	
	void movieList() throws IOException
	{
		try
		{
			String fileName="src/project/movie.txt";
			FileReader fr=new FileReader(fileName);
			
			int data=0;
			while((data=fr.read())!=-1)
				System.out.print((char)data);
				fr.close();
		}catch(FileNotFoundException e) {e.printStackTrace();}
	}
	
	void addMovie() throws IOException
	{
		int data=0;
//		movieList();
		File f = new File("src/project/movie.txt");
		System.out.println("===================");
		System.out.println("영화를 추가하시겠습니까?");
		
		String fileName="src/project/movie.txt";
		FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter(fileName, true);
		BufferedWriter bw=new BufferedWriter(fw);
		int i=2;
		while(i>0)
		{	
			Scanner sc=new Scanner(System.in);
			
			System.out.print("영화를 등록합니다.");
			String movie=sc.nextLine();
			
			
			System.out.print("장르를 입력해주세요.");
			String genre=sc.nextLine();
			
			System.out.print("연령대를 입력합니다.");
			String age=sc.nextLine();
			
			bw.write(System.currentTimeMillis()+movie+genre+age);
			bw.newLine();
			//System.out.println();
			
			
			i--;
			
		}
		bw.close();
		fw.close();
	}
	
}

