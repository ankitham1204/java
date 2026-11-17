package logicsPatterns;


	public class OnlyEvenNumbers {

		    public static void main(String[] args) {
		        int no = 2;
		        for (int row = 1; row <= 5; row++) {
		            for (int col = 1; col <= 5; col++) {
		                if (col <= row) {
		                    System.out.print(no + " ");
		                    no = no + 2;
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		}


