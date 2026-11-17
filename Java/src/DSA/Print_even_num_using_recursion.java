package DSA;

public class Print_even_num_using_recursion {
	public static void sum(int no){
		if(no==0) {
			return ;
		}
		sum(no-1);
		if(no%2!=0) {
			System.out.println(no);
		}
	}


	public static void main(String[] args){
		sum(10);

	}
	}



