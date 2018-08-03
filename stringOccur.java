//Class that counts the occurances of a name in a string of names
import java.util.*;
public class stringOccur {

	public static void main(String[] args) {
		//Accepting number of names
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names");
		int number = sc.nextInt();
		
		//Accepting names in a string
		String [] strings = new String[number];
		System.out.println("Enter the names");
		for (int i=0;i<number;i++) {
			strings[i] = sc.nextLine();
		}
		
		//Accepting name to  be searched
		System.out.println("Enter the name to be searched");
		String findName = sc.nextLine();
		
		//Calculating the number of occurences 
		int count = 0;
		for(int i=0;i<number;i++) {
			if(findName.equals(strings[i])) {
				count+=1;
			}
		}
		
		//Displaying the count of occurences
		System.out.println("The " + findName + " occurred " + count +" times");
	}

}
