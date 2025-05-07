package study.collect;

import java.util.HashSet;
import java.util.Iterator;

public class Collection02 {

	public static void main(String[] args) {
		//HashSet
		HashSet<String> set1 = new HashSet<String>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		System.out.println(set1.size());
		
		System.out.println(set1.contains("C"));
		
		for(String value : set1) {
			System.out.println(value);
		}
		
		Iterator<String> it1 = set1.iterator();
		
		// iterator
		// hasNext() : 다음 읽어올 값이 있나?
		// next() 	: 다음 값 읽어오기
		
		while(it1.hasNext()) {	// A B C
			String s = it1.next();
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
