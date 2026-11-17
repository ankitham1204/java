package logicsPatterns;


	public class SequenceCharacter {
		
		    public static void main(String[] args) {
		        char no = 'a';
		        for (int row = 1; row <= 5; row++) {
		            for (int col = 1; col <= 5; col++) {
		                if (col <= row) {
		                    System.out.print(no++ + " ");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		}


