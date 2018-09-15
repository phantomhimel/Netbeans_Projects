
import java.util.Scanner;
public class InsertionAtLastIndex {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int arrayvalue, loop;
		System.out.println("Please enter the array limit below");
		arrayvalue = myScanner.nextInt();
		int array[]= new int [arrayvalue];
		System.out.println("Please enter the values of the array below");
		for(loop=0; loop<arrayvalue; loop++) {
			
			array[loop]= myScanner.nextInt();
		}
		
		System.out.println("Please enter the new value you want to add at the last index");
		int lastvalue= myScanner.nextInt();
		array[loop]= lastvalue;
		
		System.out.print("Your updated array is\n");
		for(loop=0; loop<arrayvalue+1; loop++) {
			
			System.out.print(array[loop]+ " ");
		}
		myScanner.close();
	}

}
