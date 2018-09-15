
import java.util.Scanner;

public class LinearSearch {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("How many values you want to add?");
		int totalvalue = myScanner.nextInt();
		int array1[] = new int [totalvalue];
		System.out.println("Please enter your number in the array below");
		int firstloop;
		for( firstloop=0 ; firstloop<totalvalue; firstloop++) {
			
			array1[firstloop]= myScanner.nextInt();
		}
		
		System.out.println("Your array values successfully entered");
		System.out.println("\nPlease enter the number you want to search");
		int search= myScanner.nextInt();
		int found=0;
		for(firstloop=0; firstloop<totalvalue; firstloop++) {
			
			if (search==array1[firstloop]) {
				found=1;
				System.out.println("Your searching number " +search+" is found at the index " + (firstloop+1));
			}
		}
		if (found==0) {
			
			System.out.println("Sorry!!! Your searching number is not found the array :(");
		}
		
	}
}
