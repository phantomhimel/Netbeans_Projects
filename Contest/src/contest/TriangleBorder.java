package contest;
import java.util.Scanner;
public class TriangleBorder {

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter a positive number for printing the pyramid");
        int number = myscanner.nextInt();
        int row, columnSpace,star;
        for(row=1; row<=number; row++)
        {
            for(columnSpace= number-row; columnSpace<=1; columnSpace--)
            {
                for(star =1; star<=(row*2)-1; star++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
    
}
