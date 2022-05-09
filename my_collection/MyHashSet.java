package my_collection;

import java.util.HashSet;
import java.util.Iterator;
public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> setA = new HashSet<String>();
		boolean bRet=false;
		
		bRet=setA.add("우유");
		System.out.println(bRet);
		
		bRet=setA.add("빵");
		System.out.println(bRet);
		
		bRet=setA.add("우유");
		System.out.println(bRet);
		
		bRet=setA.add("콜라");
		System.out.println(bRet);
		
		Iterator<String> iter = setA.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		HashSet<String> setB = new HashSet<String>();
		
		bRet=setB.add("우유");
		
		
		bRet=setB.add("빵");
		
		bRet=setB.add("초코");
		
		bRet=setB.add("고기");
		
//		Iterator<String> iter = setB.iterator();
//		while(iter1.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		
//		getIter(setB);
//		
//		
//		setA.addAll(setB);//우유, 빵, 콜라+우유, 빵, 초코, 고기
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
