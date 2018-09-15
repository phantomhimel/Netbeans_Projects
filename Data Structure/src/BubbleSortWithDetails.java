import java.util.Scanner;


public class BubbleSortWithDetails {

	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		
				System.out.println("Please enter the limit of the array");
		int arraylimit = myScanner.nextInt();
		int array[] = new int [arraylimit];
		
		bubbleSort(array, arraylimit);
		
		System.out.println("Your sorted array is below");
		
		for(int x: array)
		{
			System.out.print(x+ " ");
		}

	}
	
	public static void bubbleSort(int methodarray[], int number)
	{
		System.out.println("Please enter the values to sort in the array below");
		int i,temp;
		
		for(i=0; i<number; i++)
		{
			methodarray[i] = myScanner.nextInt();
		}
		int counter=0;
		
		for(int k=0; k<number; k++)
		{
			System.out.println("Step " + (++counter));
			
			for(i=0; i<number-1-k; i++)
			{
				if(methodarray[i] > methodarray[i+1])
				{
					temp = methodarray[i];
					methodarray[i] = methodarray[i+1];
					methodarray [i+1] = temp;	
				}
				
				System.out.println("\t");
				
				for(int j=0; j<number; j++)
				{
					System.out.print(methodarray[j]+ " ");
				}
				
				System.out.println();
			}
		}
	}
}
	
