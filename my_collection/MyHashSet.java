package my_collection;

import java.util.HashSet;
import java.util.Iterator;
public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> setA = new HashSet<String>();
		boolean bRet=false;
		
		bRet=setA.add("����");
		System.out.println(bRet);
		
		bRet=setA.add("��");
		System.out.println(bRet);
		
		bRet=setA.add("����");
		System.out.println(bRet);
		
		bRet=setA.add("�ݶ�");
		System.out.println(bRet);
		
		Iterator<String> iter = setA.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		HashSet<String> setB = new HashSet<String>();
		
		bRet=setB.add("����");
		
		
		bRet=setB.add("��");
		
		bRet=setB.add("����");
		
		bRet=setB.add("���");
		
//		Iterator<String> iter = setB.iterator();
//		while(iter1.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		
//		getIter(setB);
//		
//		
//		setA.addAll(setB);//����, ��, �ݶ�+����, ��, ����, ���
//		
//		getIter(setA);
		
		setA.retainAll(setB);
		getIter(setA);
	
		
		static Iterator<String> getIter(HashSet set)
		{
			Iterator<String> iter = set.iterator();
			System.out.println("--------start-------------");
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
			System.out.println("--------end-------------");
			return iter;
		}
		
//		Iterator<String> iter = setA.iterator();
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}

	


}
