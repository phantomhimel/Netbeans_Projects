package diu.programming.contest;
import java.util.Scanner;
public class Aquaman_army {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter energy level of fishes");
        int energy = myscanner.nextInt();
        int count =0;
        int fish[] = new int [energy];
        
        for(int i=0; i<energy; i++)
        {
            fish[i] = myscanner.nextInt();
            
            if(fish[i] %2 ==0)
            {
                count++;
            }
        }
        
        
        System.out.println("Total numbers of male fish is "+count);
    }
}
