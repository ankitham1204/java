package DSA;

public class Factorial_using_recursion {
	public static int fact(int no) {
		if(no<=0) {
			return 1;
		}
		if(no%2!=0) {
			return no*fact(no-2);
		}
		return fact(no-1);
	}
 public static void main(String[] args) {
	 System.out.println(fact(10));
 }
}
