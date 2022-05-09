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
		System.out.print("�̸�:");
		String name=sc.next();
		
		System.out.print("��ȭ��ȣ:");
		String tel=sc.next();
		
		sc.nextLine();//�Է��� ƴ�� �� �ְ� �Ѿ�� �ļ��� ó��.
		
		System.out.print("�ּ�:");
		String address = sc.nextLine();
		
		System.out.println("finish...+"+name+tel+address);
		
		return new Member(name, tel, address);
	}
	int search(ArrayList<Member> list)
	{
		int idx=-1;//
		Member m=null;
		System.out.print("�˻��ϰ��� �ϴ� �̸���:");
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
			System.out.println("�˻���� ����.");
		}
		else
		{
			System.out.println("�˻����");
			System.out.println(m);
		}
		return idx;
	}

	
	void setMember(ArrayList<Member> list)
	{
		System.out.print("����");
		int idx = search(list);
		Member m=list.get(idx);
		
		System.out.print("�� ��ȭ��ȣ :");
		String tel = sc.next();
		
		sc.nextLine();
		
		System.out.print("�� �ּ� :");
		String address=sc.nextLine();
//		m.setTel(tel);//��ȭ��ȣ �����ϱ�
		
		//�ּ� �����ϱ�
//		m.setAddress(address);
		System.out.println("����Ǿ����ϴ�.");
		
		
		list.set(idx, new Member(m.getName(), tel, address));//�ٸ� ������� �����ϱ�
	}
	
	void delMember(ArrayList<Member> list)
	{
		System.out.print("����");
		int idx = search(list);
		//list.get(idx);
		list.remove(idx);
		System.out.println("�����߽��ϴ�.");
	}
	
	void printAllMember(Iterator<Member> iter)
	{
		//iter ����ؼ� �� ����� �� �ֵ��� ����.
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
	void delAllMember(ArrayList<Member> list)
	{
		list.removeAll(list);
		System.out.println("��� ��� ����");
	}
	
	void menuProcess(ArrayList<Member> list)
	{
		System.out.println("========================================");
		System.out.println("==============����������α׷�===============");
		System.out.println("========================================");
		while(flag==true)
		{
			System.out.println("1. �߰� 2. �˻� 3. ���� 4. ���� 5. ��ü��� 6. ������ �ʱ�ȭ 7. ����");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1: //�߰�. ����� �߰�,
				Member m=addMember();
				boolean bRet=list.add(m);
				if(bRet==true)
					{
					System.out.println(m);
					System.out.println("�� ����� �߰��߽��ϴ�.");
					}
				else
					System.out.println("��� �߰� ����");
				
				//addMember();
				break;
			case 2://�˻�
				System.out.println("�˻�");
				search(list);
				break;
			case 3://����
				setMember(list);
				break;
			case 4://����
				delMember(list);
				break;
			case 5://��ü���
				if(list.size()==0)
				{
					System.out.println("����� ����1");
					break;
				}
				Iterator<Member> iter=list.iterator();
				printAllMember(iter);
				break;
			case 6://������ �ʱ�ȭ
				delAllMember(list);
				break;
			case 7:
				flag=false;
				break;
			default:
				System.out.println("1-7�� �߿� �������ּ���.");
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
		//super() ��� ����
	}
	
	Member(String name, String tel, String address)
	{
		//super() ��� ����
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