import java.util.Scanner;
public class RectangularGivenLengthandWidth {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please enter the length of the rectangle: ");
		int length = myScanner.nextInt();
		System.out.print("\nPlease enter the width of the rectangle: ");
		int width = myScanner.nextInt();
		System.out.println("\n\n");
		
		int loop1,loop2;
		
		for(loop1=0; loop1<length; loop1++)
		{
			for(loop2=0; loop2<width; loop2++)
			{
				if (loop1 == 0 || loop1 == length-1 || loop2 == 0 || loop2 == width-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		myScanner.close();
	}
}
