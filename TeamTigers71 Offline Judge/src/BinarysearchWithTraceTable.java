import java.util.Scanner;

public class BinarysearchWithTraceTable {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		SearchingNumber[] binary = new SearchingNumber[100];
		System.out.println("Enter the limit of the array");
		int arraylimit = myScanner.nextInt();
		int i;
		int arr[]= new int[arraylimit]; 
		System.out.println("Enter the values in the array in ascending or descending order");
		for(i=0; i<arraylimit; i++)
		{
			arr[i]= myScanner.nextInt();
		}
		System.out.print("\nEnter the number to be searched from the array: ");
		int search_number = myScanner.nextInt();
		int minimum=0, maximum= arraylimit-1, middle = (minimum+maximum)/2;
		int store=0,found=0;
		
		while(minimum<=maximum)
		{
		//	SearchingNumber[store] binary= new SearchingNumber();
			if (arr[middle]== search_number)
			{
				SearchingNumber[] binary1 = new SearchingNumber[store];
	  			binary1[store].firstnumber = minimum;
				binary1[store].lastnumber=maximum;
				binary1[store].mid = arr[middle];
				binary1[store].data= true;
				binary1[store].midgreat = false;
				binary1[store].midless= false;
				found=1;
				break;
			}
			else if (arr[middle]>search_number)
			{
				binary[store].firstnumber= minimum;
				binary[store].lastnumber=maximum;
				binary[store].mid = arr[middle];
				binary[store].data= false;
				binary[store].midgreat= false;
				binary[store].midless= true;
				maximum= middle-1;
				middle= (minimum+maximum)/2;
				store++;
			}
			else {
				binary[store].firstnumber= minimum;
				binary[store].lastnumber=maximum;
				binary[store].mid = arr[middle];
				binary[store].data= false;
				binary[store].midgreat= false;
				binary[store].midless= true;
				minimum= middle+1;
				middle = (minimum+maximum)/2;
				store++;
			}
		}
		
		if (found==0)
		{
			System.out.println("Sorry. Your searching number "+search_number+" is not found in the array.");
			System.exit(0);
		}
		
		System.out.println("\nYour searching number "+search_number+" is found at position "+(middle+1));
		
		System.out.println("\n\n\nLowerBound\tUpperBound\tMiddleNum\tDataFound\tItem<Mid\tItem>Mid\n");
		System.out.print("=========================================================================================\n\n");
		for(i=0; i<store; i++)
		{
			System.out.print(binary[i].firstnumber +"\t\t"+binary[i].lastnumber+"\t\t"+binary[i].mid+"\t\t"+binary[i].data+"\t\t"+binary[i].midgreat+"\t\t"+binary[i].midless+"\n");
		}
		System.out.print("==========================================================================================");
	}

}
