import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hasNextTestCasae {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		double mydouble;
		ArrayList<Double> myArrayList = new ArrayList<>();
		System.out.println("Enter values in the list");
		
		try {
			
			while(myScanner.hasNextDouble())
			{
				mydouble = myScanner.nextDouble();
				myArrayList.add(mydouble);
			}
		}
		
		catch (Exception e) {
			
			System.out.println(e);
		}
		
		Collections.sort(myArrayList);
		System.out.println("Which element you want to search?");
		myScanner.next();
		double element = myScanner.nextDouble();
		Class newobj = new Class();
		int index = newobj.array(myArrayList, element);
		
		if (!((index>=0) && (index<myArrayList.size())))
		{
			System.out.println("Data not found");
		}
		else 
		{
			System.out.println("Data found at position " +(index+1));
		}
		
		myScanner.close();
	}

}
