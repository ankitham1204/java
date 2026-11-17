package DSA;

public class summation_of_n_odd_number_reversed {
	public static int sum(int no) {
		if(no==11) {
			return 0;
		}
		if(no%2!=0) {
			return no+sum(no-2);
				
			}
		return sum(no-1);
		}
	
public static void main(String[] args) {
	System.out.println(sum(20));
}
}
