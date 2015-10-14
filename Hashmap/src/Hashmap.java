import java.util.HashMap;
import java.util.Scanner;


public class Hashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "one");
		myMap.put(2, "two");
		myMap.put(3, "three");
		myMap.put(4, "four");
		myMap.put(5, "five");
		myMap.put(6, "six");
		int num;
		String response;
		System.out.print("Enter a number 1-6:?");
		num = sc.nextInt();
		System.out.print("Keep going? Y/N");
		response = sc.next();
		sc.nextLine();
		while (response.equalsIgnoreCase("Y")){
		if (myMap.containsKey(num)){
			
			System.out.print("Response: You entered " + myMap.get(num));
			
		}
		else 
		{
			System.out.print("out of range");
		}
	    
		System.out.println("\nKeep going? Y/N");
		response = sc.next();
		sc.nextLine();
		}
		
		

	}

}
