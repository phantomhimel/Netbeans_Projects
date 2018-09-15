package fahad;
import java.util.Scanner;
import java.io.*;

public class splitstring {

	    private static Scanner s1;

		public static void main(String[] args)  {

	        Double sum=0.0;
	        String str;
	        try {
	            String id,name,java,algo,db;
	            Double avg;
	            File f=new File ("Exam.txt");
	            FileWriter fw=new FileWriter(f);
	            Scanner input=new Scanner(System.in);
	            System.out.println("Enter ID:");
	            id=input.nextLine();
	            fw.write("\r\n"+id);
	            System.out.println("Name:");
	            name=input.nextLine();
	            fw.write("\r\n"+name);
	            System.out.println("Marks in java:");
	            java=input.nextLine();
	            fw.write("\r\n"+java);
	            System.out.println("Marks in Algorith:");
	            algo=input.nextLine();
	            fw.write("\r\n"+algo);
	            System.out.println("Marks in ");
	            db=input.nextLine();
	            fw.write("\r\n"+db);
	            fw.close();
	            
	        } catch (Exception e) {
	            System.out.println(".........");
	        }
	        try{
	            int count=0;
	        File f=new File ("Exam.txt");
	        s1 = new Scanner(f);
	         while(s1.hasNextLine()){
	            str = s1.nextLine(); 
	            String [] parts=str.split(" ");
	            if(parts.length==2){   
	            count++;    
	            sum+=Double.parseDouble(parts[1]);
	            }
	         }
	         System.out.println("Average:"+sum/count);
	        }
	        catch(Exception e){
	            System.out.println("File not fount");
	           }         
	        }
}

