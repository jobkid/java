package StringClass;

public class Ex2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String fullName="Hello.java";
		int index = fullName.indexOf('.');//.�� ��ġ�� ã��
		System.out.println(index);
		String fileName=fullName.substring(0,index);
		System.out.println(fileName);
		String ext=fullName.substring(index+1);
		System.out.println(ext);
		System.out.println(fullName+"�� Ȯ���ڸ� ������ �̸���"+fileName);
		System.out.println(fullName+"�� Ȯ���ڴ�"+ext);*/
		
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
			String mySubstringExt=s.substring(index+1);//Ȯ����
			
			
			System.out.println(mySubstringExt+"/"+mySubstringExt.length());//���ϸ�
			String mySubstringfilename=s.substring(0,index);
			System.out.println(mySubstringfilename+"/"+mySubstringfilename.length());
			
			if(mySubstringExt.equals("class"))
			{
				System.out.println("Ȯ���ڰ� class������"+mySubstringfilename+".class");
			}
		}
		
		
		
	}	

}


