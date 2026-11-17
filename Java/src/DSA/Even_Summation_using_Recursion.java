package DSA;
class Even_Summation_using_Recursion {

public static int sum(int no){
	if(no<=0) {
		return 0;
	}
	
	if(no%2!=0) {
		return no+sum(no-2);
	}
	return sum(no-1);
}


public static void main(String[] args){
	System.out.println(sum(7));

}
}
