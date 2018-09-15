import java.util.Scanner;
import java.io.*;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		File file = new File ("output.txt");
		FileWriter fw;
		String name,id,firstsubject = null,secondsubject=null,thirdsubject=null;
		try {
			fw = new FileWriter(file);
			System.out.print("Enter name : ");
			name = myscanner.next();
			System.out.print("Enter id : ");
			id = myscanner.next();
			System.out.print("Number of first subject : ");
			myscanner.nextLine();
			firstsubject = myscanner.nextLine();
			System.out.print("Number of second subject : ");
			secondsubject = myscanner.nextLine();
			System.out.print("Number of third subject : ");
			thirdsubject = myscanner.nextLine();
			fw.write(name+"\n"+id+"\n"+firstsubject+"\n"+secondsubject+"\n"+thirdsubject);
			fw.close();
		} catch (IOException e) {
		
		    System.err.println("Something went wrong!!");
		}
		
		double sum =0.0;
		sum=+ (Double.parseDouble(firstsubject)+ Double.parseDouble(secondsubject)+Double.parseDouble(thirdsubject));
		System.out.println("\n\n");
		
		try {
			File readfile = new File("output.txt");
			Scanner sc = new Scanner(readfile);
			
			while(sc.hasNext())
			{
				System.out.println("Name is : "+sc.nextLine());
				System.out.println("ID is : "+sc.nextLine());
				System.out.println("First subject is : "+sc.nextLine());
				System.out.println("Second subject is : "+sc.nextLine());
				System.out.println("Third subject is : "+sc.nextLine());
			
				
			}
			sc.close();
			
		} catch (IOException e) {
			
			System.err.println("Something went wrong");
			
		}
		System.out.println("Average is : " +(sum/3));
		myscanner.close();
		
	}

}
