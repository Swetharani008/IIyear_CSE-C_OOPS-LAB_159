// EX.NO:10 IMPLEMENTATIONOFFILEHANDLING

import java.io.File;
import java.util.Scanner; 
public class EX_NO_10 { 
public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter directory path: "); 
	String path = sc.nextLine(); 
	File directory = new File(path);
	if (directory.exists() && directory.isDirectory()) { 
		File[] files = directory.listFiles(); 
		System.out.println("\nFiles in the directory:"); 
		if (files != null) { 
			for (File file : files) { 
				if (file.isFile()) { 
					System.out.println(file.getName());
				 }
			 }
		 }
	 } 
	else { 
		System.out.println("Invalid directory path.");
	 } 
	sc.close();
}
}

OUTPUT:

Enter directory path: C:\Users\Documents 
Files in the directory: 
file1.txt 
file2.txt 
program.java 
notes.docx
	


