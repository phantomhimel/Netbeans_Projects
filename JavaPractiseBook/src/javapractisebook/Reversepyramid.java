package javapractisebook;
import java.util.Scanner;
public class Reversepyramid {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter the row number");
        short row = myscanner.nextShort();
        
        short i,j;
        for(i=1; i<=row; i++)
        {
            for(j=i; j<= row; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    
}
