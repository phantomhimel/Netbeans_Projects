package write;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class WritingFIle {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter the total profit of the project");
		int profit = myscanner.nextInt();
		
		try 
		{
			File file = new File("Profit.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("\r\n"+profit);
			fw.close();
			System.out.println("File created successfully");
			
		} catch (Exception e) {

			System.out.println("File not found");
		}
		
		try 
		{
			File file  = new File("Profit.txt");
			Scanner sc = new Scanner(file);
			String str = null;
			while(sc.hasNextLine())
			{
				str = sc.nextLine();
				System.out.println(str);
				
			}
			int p = Integer.parseInt(str);
			if(p<5000)
			{
				System.out.println("Good profit");
			}
			else
			{
				System.out.println("Not good way");
			}
		} catch (Exception e) {

			System.out.println("File did not read successfully");
		}
		
	}
}
