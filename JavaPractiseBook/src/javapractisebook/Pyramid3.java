package javapractisebook;
import java.util.Scanner;
public class Pyramid3 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter the row of the pyramid");
        short row = myscanner.nextShort();
        
        for(short i=1; i<= row; i++)
        {
            for(short j =0; j<=row; j++)
            {
                if(j!=row-i)
                {
                    System.out.print(" ");
                }
                else 
                {
                        System.out.print(i+ " ");
                }
            }
            System.out.println();
        }
    }
    
}
