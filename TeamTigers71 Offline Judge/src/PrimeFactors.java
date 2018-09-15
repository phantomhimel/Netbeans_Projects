import java.util.*;
public class PrimeFactors {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter the number to get the prime factors");
		int getnumber = myScanner.nextInt();
		
		prime_numbers(getnumber);
		myScanner.close();
	}
	
	public static void prime_numbers(int number)
	{
		int i;
		for(i=2; number>1; i++)
		{
			while(number%i==0)
			{
				System.out.println(i);
				number/=i;
			}
		}
	}

}
