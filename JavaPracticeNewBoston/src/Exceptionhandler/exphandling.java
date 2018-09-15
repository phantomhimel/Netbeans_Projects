package Exceptionhandler;
import java.util.Scanner;

public class exphandling {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
	
		int k =1;
		do {
		try {
			
				System.out.println("Enter your first number");
				int a = myScanner.nextInt();
				System.out.println("Enter your second number");
				int b = myScanner.nextInt();
				int sum = a/b;
				k = 2;
				
				System.out.println(sum);
	       }
			
		 catch (Exception e) {
	
			System.out.println("You cant do that division");
		}
		}while(k == 1);
		
		
		System.out.println("thank you");
		myScanner.close();
	
}
}
