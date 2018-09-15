import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter the limit of the array: ");
		int arraylimit = myScanner.nextInt();
		int arr[]= new int [arraylimit];
		System.out.println("Please enter the values in ascending or descending order");
		
		for(int i=0; i<arraylimit; i++)
		{
			arr[i] =myScanner.nextInt();
		}
		
		System.out.print("\nPlease enter the vlaue you want to be searched from the array: ");
		int search_number = myScanner.nextInt();
		
		int first =0, last =arraylimit-1, middle = (first+last)/2;
		
		while (first<=last) {
			
			if (arr[middle] == search_number)
			{
				System.out.println("Your searching number " +search_number+" is found at the position "+(middle+1));
				break;
			}
			else if(arr[middle] < search_number)
			{
				first = middle+1;
				middle= (first+last)/2;
			}
			else 
			{
				last = middle-1;
				middle = (first+last)/2;
			}
			
		}
		boolean tr = true;
		boolean fl = false;
		System.out.println("\nTrace table\n");
		first =0; last=arraylimit-1; middle = (first+last)/2;
		System.out.println("First\tLast\tMid\tValue\tData\tItem<Mid\tItem>Mid\n");
		System.out.println("=================================================================");
	while (first<=last) {
			
			if (arr[middle] == search_number)
			{
				System.out.format("%d\t%d\t%d\t%d\t%s\t%s\t\t%s\n", first,last,middle,arr[middle],tr,fl,fl);
				break;
			}
			else if(arr[middle] < search_number)
			{
				System.out.format("%d\t%d\t%d\t%d\t%s\t%s\t\t%s\n", first,last,middle,arr[middle],fl,fl,tr);
				first = middle+1;
				middle= (first+last)/2;
			}
			else 
			{
				System.out.format("%d\t%d\t%d\t%d\t%s\t%s\t\t%s\n", first,last,middle,arr[middle],fl,tr,fl);
				last = middle-1;
				middle = (first+last)/2;
			}
		}
	System.out.print("===================================================================");
	
		myScanner.close();
	}

}
