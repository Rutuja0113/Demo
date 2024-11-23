package com.mapcode;
import java.util.*;


public class Test {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "ram");
		m.put(2, "sita");
		m.put(3, "Ayushya");
	//	System.out.println(m);
		Set<Integer>keys=m.keySet();
		//System.out.println(keys);
		Iterator<Integer>itr=keys.iterator();
		while(itr.hasNext())
		{
		int x=	itr.next();
		
		String r = m.get(x);
		System.out.println(x+" "+r);
		}
		

	}

}
