package diu.programming.contest;

import java.util.Scanner;
public class ChotoChele_and_dumb_numbers {

    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        
        System.out.println("Enter the number of test cases");
        int test = myscanner.nextInt();
        int count =0;
        
        for(int i=0; i<test; i++)
        {
            System.out.println("Enter the begining of the number");
            int begining = myscanner.nextInt();
            System.out.println("Enter the last number");
            int last = myscanner.nextInt();
            
            for(int j= begining; j<=last; j++)
            {
                if((isPrime(j)))
                {
                    count++;
                }
            }
            System.out.print("Case "+i+" : "+ count);
            count =0;
        }
    }
    
    public static boolean isPrime(int number)
    {
        
        if(number == 1 || number == 0)
        {
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(number); i++)
        {
            if(number%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
}
