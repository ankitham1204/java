package logicsPatterns;


	public class HollowSquare {
		
		    public static void main(String[] args) {
		        for (int row = 1; row <= 5; row++) {
		            for (int col = 5; col >= 1; col--) {
		                if (col == 1 || col == 5 || row == 1 || row == 5) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.println();
		        }
		    }
		}


