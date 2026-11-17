package DSA;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sam {
public static void main(String[] args) {
	String s="aabbccdda";
	Map<Character,Integer> m=new LinkedHashMap<Character, Integer>();
	for(char x:s.toCharArray()) {
		m.put(x, m.getOrDefault(x, 0)+1);
	}
	for(char y:m.keySet()) {
		System.out.print(y);
	}
}
}
