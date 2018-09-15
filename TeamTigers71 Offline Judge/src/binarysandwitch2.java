import java.util.Scanner;
public class binarysandwitch2 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter the number of length of the rectangle");
		int length = myScanner.nextInt();
		System.out.println("Enter the number of width of the rectangle");
		int width = myScanner.nextInt();
		
		int i,j;
		
		for(i=1; i<=length; i++)
		{
			for(j=1; j<=width; j++)
			{
				if (j%2==0)
				{
					System.out.print("0");
				}
				else 
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
		myScanner.close();
	}

}
