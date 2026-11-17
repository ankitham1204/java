package logicsCollections;
import java.util.Map;
import java.util.LinkedHashMap;




public class Frequencyofcharactersinmap {
	public static void main(String[] args) {
		String s="abaccdcc";
		Map<Character,Integer> map=new LinkedHashMap();
		for(char x:s.toCharArray()) {
			map.put(x,map.getOrDefault(x, 0)+1);
		}
		for(Map.Entry<Character,Integer>y:map.entrySet()) {
			System.out.println(y.getKey()+" "+y.getValue());
		}
				
	}

}