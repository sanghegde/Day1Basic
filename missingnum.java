import java.util.*;
	
	public class missingnum {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	//Accepting the size of the array
	System.out.println("Enter size of array");
	int l = sc.nextInt();
	int temp = 0;
	int arr[] = new int [l];
	
	//Accepting Array Elements
	System.out.println("Enter elements");
	for(int i=0;i<l;i++)
	{
	arr[i] = sc.nextInt();
	}
	
	//finding minimum number in array
	int minimum = arr[0];
	for(int i=0;i<l;i++)
	{
	if(minimum > arr[i])
	{
	minimum = arr[i];
	}
	}

	//sorting the array
	for(int i=0;i<l;i++)
	{
	for(int j=i+1;j<l;j++)
	{
	if(arr[j] < arr[i])
	{
	temp = arr[j];
	arr[j] = arr[i];
	arr[i] = temp;
	}
	}
	}

	//generating array of complete series
	int copy [] = new int [l+1];
	for(int i=0;i<=l;i++)
	{
	copy[i]=minimum;
	minimum+=1;
	}

	//finding missing number
	int index=0;
	for(int j=0; j<l; j++)
	{
	if(arr[j] == copy[index])
	{
	index+=1;
	continue;
	}
	else
	{
	System.out.println("Missing number is "+copy[index]);
	break;
	}
	}
	}
	}
