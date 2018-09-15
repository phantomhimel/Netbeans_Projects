import java.util.Scanner;
public class binaryRectangleborder1 {

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
				if (i == 0 || i == length-1 || j == 0 || j== width-1)
				{
					System.out.print("1");
				}
				else 
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		myScanner.close();
	}
}
