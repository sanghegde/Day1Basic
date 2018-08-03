//Class to calculate Discount Price
import java.util.*;

public class calculateDiscount {

	public static void main(String[] args) {
		//Accepting item price
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter item price");
		float newItem = scanner.nextFloat();
		
		//Calculating Discount
		System.out.println("Calculating discount");
		float discount = (float)0.35 * newItem;
		System.out.println("Discount is "+discount);
		
		//Calculating new price
		float newItemPrice = newItem - discount;
		System.out.println("New Item Price is " + newItemPrice);
	}

}
