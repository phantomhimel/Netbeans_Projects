import java.util.Scanner;
public class InsertionSort {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the limit of the array");
		short limit = myScanner.nextShort();
		short array[] = new short [limit];
		
		Insertionsort(array,limit);
		
		System.out.println("Your updated sorted array is");
		for(short x: array)
		{
			System.out.print(x +" ");
		}
	}
	
    static void Insertionsort(short arr[], short limit)
	{
		System.out.println("Enter the values in the array below");
		for(short loop =0; loop<limit; loop++)
		{
			arr[loop] = myScanner.nextShort();
		}
		
		short value, hole;
		for(short loop2= 1; loop2 < limit; loop2++)
		{
			value = arr[loop2];
			hole = loop2;
			
			while(hole > 0 && value < arr[hole-1])
			{
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole] = value;
		}
	}
}
