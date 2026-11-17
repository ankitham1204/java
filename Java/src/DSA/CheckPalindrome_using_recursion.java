package DSA;

public class CheckPalindrome_using_recursion {
	public static boolean pal(String s,int i,int j) {
		if(i>=j) {
			return true;
		}
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		return pal(s,++i,--j);
	}
public static void main(String[] args) {
	String s="level";
	if(pal(s,0,s.length()-1)) {
		System.out.println("p");
	}else {
		System.out.println("np");
	}
}
}
