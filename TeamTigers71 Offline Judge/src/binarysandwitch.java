import java.util.Scanner;
public class binarysandwitch {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle");
		int length = myScanner.nextInt();
		System.out.println("Enter the width of the rectangle");
		int width = myScanner.nextInt();
		int i,j;
		
		for(i=0; i<length; i++)
		{
			for(j=0; j<width; j++)
			{
				if ((i+j)%2==0)
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
