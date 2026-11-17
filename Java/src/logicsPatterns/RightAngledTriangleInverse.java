package logicsPatterns;


	public class RightAngledTriangleInverse {
		
		
		    public static void main(String[] args) {
		        for (int row = 1; row <= 5; row++) {
		            // Print leading spaces
		            for (int space = 1; space < row; space++) {
		                System.out.print("  ");
		            }
		            // Print stars
		            for (int col = row; col <= 5; col++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
	}


