//  EX.NO:9  STRING OPERATIONS USING ARRAYLIST

import java.util.ArrayList; 
import java.util.Scanner; 
public class  EX_NO_9{    
	public static void main(String[] args) {        
		Scanner sc = new Scanner(System.in);        
		ArrayList<String> list = new ArrayList<>();        
		int choice;        
		do {            
			System.out.println("\n--- STRING OPERATIONS ---");           
			System.out.println("1. Append");            
			System.out.println("2. Insert");            
			System.out.println("3. Search");            
			System.out.println("4. Display Starting Letter");            
			System.out.println("5. Display All");           
			System.out.println("6. Exit");            
			System.out.print("Enter your choice: ");            
			choice = sc.nextInt();            
			sc.nextLine();            
			switch (choice) {                
				case 1:                    
					System.out.print("Enter string: ");                    
					list.add(sc.nextLine());                    
					System.out.println("String added successfully.");                    
					break;                
				case 2:                    
					System.out.print("Enter index: ");                    
					int index = sc.nextInt();                    
					sc.nextLine();                    
					System.out.print("Enter string: ");                    
					String value = sc.nextLine();                    
					if (index >= 0 && index <= list.size()) {                        
						list.add(index, value);                        
						System.out.println("String inserted successfully.");                    
					} 
					else {                        
						System.out.println("Invalid index.");                    
					}                    
					break;                
				case 3:                    
					System.out.print("Enter string to search: ");                    
					String search = sc.nextLine();                    
					if (list.contains(search)){                       
						System.out.println("String found.");                    
					}
					else{                       
						System.out.println("String not found.");                    
					}
					break;                
				case 4:                    
					System.out.print("Enter starting letter: ");                    
					char ch = sc.nextLine().charAt(0);                    
					System.out.println("Matching strings:");                    
					for (String s : list) {                        
						if (Character.toLowerCase(s.charAt(0)) ==                                
							Character.toLowerCase(ch)) {                            
								System.out.println(s);                        
							}                    
						}                    	
					break;                
				case 5:                    
					System.out.println("ArrayList: " + list);                    
					break;                
				case 6:                    
					System.out.println("Program terminated.");                    
					break;                
				default:                    
					System.out.println("Invalid choice.");            
				}        
			} 
			while (choice != 6);        
			sc.close();   
		} 
}

OUTPUT:

--- STRING OPERATIONS ---
1. Append
2. Insert
3. Search
4. Display Starting Letter
5. Display All
6. Exit
Enter your choice: 1
Enter string: Apple
String added successfully.

--- STRING OPERATIONS ---
1. Append
2. Insert
3. Search
4. Display Starting Letter
5. Display All
6. Exit
Enter your choice: 1
Enter string: Banana
String added successfully.

--- STRING OPERATIONS ---
1. Append
2. Insert
3. Search
4. Display Starting Letter
5. Display All
6. Exit
Enter your choice: 2
Enter index: 1
Enter string: Mango
String inserted successfully.

--- STRING OPERATIONS ---
1. Append
2. Insert
3. Search
4. Display Starting Letter
5. Display All
6. Exit
Enter your choice: 5
ArrayList: [Apple, Mango, Banana]

--- STRING OPERATIONS ---
1. Append
2. Insert
3. Search
4. Display Starting Letter
5. Display All
6. Exit
Enter your choice: 3
Enter string to search: Mango
String found.

---STRING OPERATIONS ---
1. Append 
2. Insert 
3. Search 
4. Display Starting Letter 
5. Display All 
6. Exit 
Enter your choice: 6 
Program terminated.

