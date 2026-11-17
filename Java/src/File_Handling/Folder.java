package File_Handling;

import java.io.File;

public class Folder {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\ABHISHEK M\\OneDrive\\Desktop\\jsp");
		if(f1.mkdirs()) {
			System.out.println("folder created");
		}else {
			System.out.println("folder not created");
		}
		if(f1.exists()) {
			System.out.println("folder existed");
		}else {
			System.out.println("folder not existed");
		}
		if(f1.delete()) {
			System.out.println("folder deleted");
		}else {
			System.out.println("folder not deleted");
		}
		
	}

}
