import java.util.Scanner;
public class BiologyNumberofBacteria {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Time 1: ");
		double t1 = myScanner.nextDouble();
		System.out.print("\nPrimary number of bacteria: ");
		double a1 = myScanner.nextDouble();
		System.out.print("\nAfter transform the total number of bacteria: ");
		double y1 = myScanner.nextDouble();
		
		double temp= y1/a1;
		
		double b = rootnumber(temp, t1);
		System.out.println("\nTime 2");
		double t2 = myScanner.nextDouble();
		
		double y = Math.pow(b, t2);
		int result = (int) (y*a1);
		
		System.out.println("\nAfter 2 days the toal number of bacteria will be "+result);
		myScanner.close();
	}
	public static double rootnumber(double num,double rootnumber)
	{
		return Math.pow(Math.E, Math.log(num)/rootnumber);
	}

}
