package StringClass;

public class Ex2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String fullName="Hello.java";
		int index = fullName.indexOf('.');//.의 위치를 찾음
		System.out.println(index);
		String fileName=fullName.substring(0,index);
		System.out.println(fileName);
		String ext=fullName.substring(index+1);
		System.out.println(ext);
		System.out.println(fullName+"의 확장자를 제외한 이름은"+fileName);
		System.out.println(fullName+"의 확장자는"+ext);*/
		
/*		String[] fullNamearr={"ChromeSetup.exe","MainActivity.java","MainActivity.class","mouse.dll","MenuActivity.class"};
		
		String ext="";
		String z="";
		int i;
		int index;

		for(i=0; i<fullNamearr.length; i++)
		{
			index=fullNamearr[i].indexOf(".");
			System.out.println(index);
			
			String fileName=fullNamearr[i].substring(0,index);
			System.out.println(fileName);
			
			ext = fullNamearr[i].substring(index+1);
			System.out.println(ext);
			
			if (fullNamearr[i].equals("class"))
			{
				fullNamearr[i].substring(0,fullNamearr.length);
				
						
			}
			
		
		}
  
 */
		
		String fullName = "ChromeSetup.exe, MainActivity.java, MainActivity.class, mouse.dll, MenuActivity.class";
		String []str=fullName.split(",");
		//int index=fullName.indexOf(',');
		
		for(String s:str)
		{
			System.out.println(s);
			int index =s.indexOf('.');
			System.out.println(index);
			String mySubstringExt=s.substring(index+1);//확장자
			
			
			System.out.println(mySubstringExt+"/"+mySubstringExt.length());//파일명
			String mySubstringfilename=s.substring(0,index);
			System.out.println(mySubstringfilename+"/"+mySubstringfilename.length());
			
			if(mySubstringExt.equals("class"))
			{
				System.out.println("확장자가 class파일임"+mySubstringfilename+".class");
			}
		}
		
		
		
	}	

}


