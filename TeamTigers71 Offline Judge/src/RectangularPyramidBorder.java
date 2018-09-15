import java.util.Scanner;
public class RectangularPyramidBorder {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please enter the number of rows of the rectangular box: ");
		int row = myScanner.nextInt();
		int i,j;
		
		for(i=0; i<row; i++)
		{
			for(j=0; j<row; j++)
			{
				if (i == 0 || i == row-1 || j == 0 || j == row-1)
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
