import java.util.Scanner;

public class TriangleBorder {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter the number of row of the pyramid");
		int height = myScanner.nextInt();
		int base = (height*2);
		int row,column,i;
		
		for(row=0; row<height; row++)
		{
			for(column=0; column<base; column++)
			{
				if (column == height-row || column == height +row )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				if(row == height-1)
				{
					for( i=0; i<height; i++)
					{
						System.out.print("* ");
					}
					if (i==height)
					{
						break;
					}
				}
			}
			System.out.println();
		}
		myScanner.close();
	}

}
