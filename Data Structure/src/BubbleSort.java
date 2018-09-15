import java.util.Scanner;

public class BubbleSort {

	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("How many number you want to add in your array?");
		int arraynumber= myScanner.nextInt();      // giving input from keyboard
		sortfunction(arraynumber);           // passing array number to the "sortfunction" method to process 
		
	}
	
	public static void sortfunction(int number) {
		
		int valuesOfArray[] = new int [number];   // making an array of number 
		int temporaryVariable=0;   // a temporary variable for storing the array data
		int firstArray=0,  secondArray=0;  
		System.out.print("Please enter the variable in the array below\n");
		for(firstArray=0; firstArray<number; firstArray++) {         // loop used for entering values which will be sorted
			valuesOfArray[firstArray] = myScanner.nextInt();
		}
		
		// bubble sort in ascending order
		for(firstArray=0; firstArray<number; firstArray++) {  
			for(secondArray=0; secondArray<number-1-firstArray; secondArray++) {  // number-1-firstarray means the second loop will work before the last number of the array.
				                                                                   // as we know that the bubble sort is will work until the last number of the array.
				if (valuesOfArray[secondArray]>valuesOfArray[secondArray+1]) {   // if the first number of the array is greater than the second number of the array then....
					
					temporaryVariable = valuesOfArray[secondArray];    // the number will be stored in the temporary variable 
					valuesOfArray[secondArray] = valuesOfArray[secondArray+1];       // the next number of the comparing variable of the array will be stored in the first number to compare the that of second number of the array 
					valuesOfArray[secondArray+1] = temporaryVariable;    // the stored temporary variable will be stored in the second number of the array.
				}                                                      
			}
		}
		
		System.out.println("Your sorted array is below :)");
		for(firstArray=0; firstArray<number; firstArray++) {
			
			System.out.print(valuesOfArray[firstArray]+ " ");    // printing the variable of the first array
		}
		myScanner.close();
	}
}
