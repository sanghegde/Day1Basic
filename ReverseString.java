//program reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
import java.util.Scanner;
public class ReverseString {
	
	public static void main(String args[])
	{
		System.out.println("Enter the string to be reversed");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String words[]=str.split(" ");
		String reverse= "";
		for(int i=0;i<words.length;i++)
			
			{
			for(int j=words[i].length()-1;j>=0;j--)
			
			{
				reverse +=words[i].charAt(j);
			}
		System.out.print(reverse+ " ");
		reverse= "";
	}

}
}