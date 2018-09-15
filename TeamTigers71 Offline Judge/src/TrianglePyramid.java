import java.util.Scanner;

public class TrianglePyramid {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter the row number of the pyramid to print");
		int rownumber = myScanner.nextInt();
		int row,columnSpace,star;
		
		for(row=1; row<=rownumber; row++)
		{
			for(columnSpace= rownumber-row; columnSpace>=1; columnSpace--)
			{
				System.out.print(" ");
			}
			{
				for(star= 1; star<= (row*2)-1; star++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		myScanner.close();
	}

}
