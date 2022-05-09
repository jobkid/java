package my_collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

//import java.util.*;
public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Member> a1=new ArrayList<Member>();
		MemberMenu mm = new MemberMenu();
		mm.menuProcess(a1);

	}

}

class MemberMenu
{
	Scanner sc = new Scanner(System.in);
	boolean flag=true;
	
	Member addMember()
	{
		System.out.print("이름:");
		String name=sc.next();
		
		System.out.print("전화번호:");
		String tel=sc.next();
		
		sc.nextLine();//입력할 틈을 안 주고 넘어가서 꼼수로 처리.
		
		System.out.print("주소:");
		String address = sc.nextLine();
		
		System.out.println("finish...+"+name+tel+address);
		
		return new Member(name, tel, address);
	}
	int search(ArrayList<Member> list)
	{
		int idx=-1;//
		Member m=null;
		System.out.print("검색하고자 하는 이름은:");
		String name = sc.next();
		
		for(int i=0; i<list.size(); i++)
		{
			m = list.get(i);
			if(m.getName().equals(name))
			{
				idx=i;
				break;
			}
		}
		
		if(idx==-1)
		{
			System.out.println("검색결과 없다.");
		}
		else
		{
			System.out.println("검색결과");
			System.out.println(m);
		}
		return idx;
	}

	
	void setMember(ArrayList<Member> list)
	{
		System.out.print("수정");
		int idx = search(list);
		Member m=list.get(idx);
		
		System.out.print("새 전화번호 :");
		String tel = sc.next();
		
		sc.nextLine();
		
		System.out.print("새 주소 :");
		String address=sc.nextLine();
//		m.setTel(tel);//전화번호 변경하기
		
		//주소 변경하기
//		m.setAddress(address);
		System.out.println("변경되었습니다.");
		
		
		list.set(idx, new Member(m.getName(), tel, address));//다른 방법으로 저장하기
	}
	
	void delMember(ArrayList<Member> list)
	{
		System.out.print("삭제");
		int idx = search(list);
		//list.get(idx);
		list.remove(idx);
		System.out.println("삭제했습니다.");
	}
	
	void printAllMember(Iterator<Member> iter)
	{
		//iter 사용해서 값 출력할 수 있도록 하자.
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
	void delAllMember(ArrayList<Member> list)
	{
		list.removeAll(list);
		System.out.println("모든 멤버 삭제");
	}
	
	void menuProcess(ArrayList<Member> list)
	{
		System.out.println("========================================");
		System.out.println("==============멤버관리프로그램===============");
		System.out.println("========================================");
		while(flag==true)
		{
			System.out.println("1. 추가 2. 검색 3. 수정 4. 삭제 5. 전체출력 6. 데이터 초기화 7. 종료");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1: //추가. 멤버를 추가,
				Member m=addMember();
				boolean bRet=list.add(m);
				if(bRet==true)
					{
					System.out.println(m);
					System.out.println("위 멤버를 추가했습니다.");
					}
				else
					System.out.println("멤버 추가 실패");
				
				//addMember();
				break;
			case 2://검색
				System.out.println("검색");
				search(list);
				break;
			case 3://수정
				setMember(list);
				break;
			case 4://삭제
				delMember(list);
				break;
			case 5://전체출력
				if(list.size()==0)
				{
					System.out.println("멤버가 없음1");
					break;
				}
				Iterator<Member> iter=list.iterator();
				printAllMember(iter);
				break;
			case 6://데이터 초기화
				delAllMember(list);
				break;
			case 7:
				flag=false;
				break;
			default:
				System.out.println("1-7번 중에 선택해주세요.");
			}	
		}//while
		System.out.println();
	}
	
}

class Member
{
	private String name;
	private String tel;
	private String address;
	
	Member()
	{
		//super() 없어도 무방
	}
	
	Member(String name, String tel, String address)
	{
		//super() 없어도 무방
		this.name=name;
		this.tel=tel;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "[Member name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
	
	
}