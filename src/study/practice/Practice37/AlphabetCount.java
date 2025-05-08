package study.practice.Practice37;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;

public class AlphabetCount {

	public static void main(String[] args) {
//		String str = "Returns a completion of the value and message";
//
//		1. 이 문장에 사용된 알파벳의 갯수는 몇개인가요?
//		(중복된 수 제외, 대소문자 구분X)
//		Ex) R r 둘다 구분하지 않고 알파벳 r 한개라고 체크
//
//		2. 이 문장에 사용된 알파벳들이 각각 몇 글자씩 있는지 세어보고 출력하세요.
		HashMap<String,Integer>map1 = new HashMap<String, Integer>();
		String str = "Returns a completion of the value and message";
		str = str.toLowerCase();
		HashSet<String> set1 = new HashSet<String>();
		for(int i=0;i<str.length();i++) {
			set1.add(Character.toString(str.charAt(i)));
		}
		set1.remove(" ");
		System.out.printf("문장의 알파벳의 갯수는:%d\n",set1.size());
		for(String alp : set1) {
			map1.put(alp, 0);
		}
		for(int i=0;i<str.length();i++) {
			for(String key : map1.keySet()) {
				if(Character.toString(str.charAt(i)).equals(key))map1.put(key,map1.get(key)+1);
			}
		}
		for(java.util.Map.Entry<String, Integer> entry:map1.entrySet()) {
			System.out.println("알파벳:"+entry.getKey()+" "+"갯수:"+entry.getValue());
		}
	}

}
