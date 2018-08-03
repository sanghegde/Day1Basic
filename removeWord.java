//Class that removes extra spaces and particular word from a given sentence
import java.util.*;
public class removeWord {

	public static void main(String[] args) {
		//Accepting input sentence
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = sc.nextLine();
		
		//Removing Extra spaces
		sentence = sentence.trim().replaceAll(" +", " ");
		
		//Accepting the word to be deleted
		System.out.println("Enter a word to be deleted");
		String word = sc.nextLine();
		
		//Accepting the position of the word
		System.out.println("Enter position of the word to be deleted");
		int position = sc.nextInt();
		
		//Removal of given word
		int count = 0, length = sentence.length(), wordlength = word.length();
		for(int i = 1; i<=length; i++)
		{
			if(sentence.charAt(i) == ' ')
				count++;
			if(count == position -1) {
				StringBuffer sent = new StringBuffer(sentence);
				sent=sent.replace(i+1, i+wordlength+1, " ");
				sentence = sent.toString();
				break;
			}
		}
		sentence = sentence.trim().replaceAll(" +", " ");
		
		//Displaying final string
		System.out.println(sentence);
	}

}
