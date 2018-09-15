import java.io.*;
import java.util.Scanner;
public class Split {

	private static Scanner r;

	public static void main(String[] args) {
    try {
			
			File file = new File ("splitstring.txt");
			FileWriter fw = new FileWriter(file);
		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = myscanner.nextLine();
		fw.write("\n"+name);
		System.out.print("Enter your id: ");
		String id = myscanner.nextLine();
		fw.write("\n"+id);
		System.out.print("Enter first subject and marks: ");
		String firstnumber = myscanner.nextLine();
		fw.write("\n"+firstnumber);
		System.out.print("Enter second subject and marks: ");
		String secondnumber = myscanner.nextLine();
		fw.write("\n"+secondnumber);
		System.out.print("Enter third subject and marks: ");
		String thirdnumber = myscanner.nextLine();
		fw.write("\n"+thirdnumber);
     	fw.close();
    	myscanner.close();
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
		
		double sum =0.0;
		short count = 0;
		
		try {
			
			File readfile = new File("splitstring.txt");
			r = new Scanner(readfile);
			String str;
			while(r.hasNextLine())
			{
				str = r.nextLine();
				String part[] = str.split(" ");
				if(part.length == 2)
				{
					count++;
					sum+= Double.parseDouble(part[1]);
				}
			}
			System.out.print("Average is "+ sum/count);
		}
		catch(Exception e)
		{
			System.err.print("Something went wrong!! \nPlease enter your name without space");
		}
		
	}
}
