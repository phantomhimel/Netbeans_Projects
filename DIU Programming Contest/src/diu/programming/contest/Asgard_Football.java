package diu.programming.contest;
import java.util.Scanner;
public class Asgard_Football {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter the passes done by the \"Barcelona\"");
        int barcelona = myscanner.nextInt();
        System.out.println("Enter the passes done by the \"Real-Madrid\"");
        int real = myscanner.nextInt();
        
        System.out.println("Total passes made by two teams: "+(barcelona+real));
    }
}
