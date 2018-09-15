package diu.programming.contest;

import java.util.Scanner;
public class Girl_lost_in_city {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        System.out.println("How many city she wants to travel");
        int city = myscanner.nextInt();
        int travel[] = new int [city];
        for(int i=0; i<city; i++)
        {
            travel[i] = myscanner.nextInt();
            
            int ways = travel[i] -1;
            if(travel[i] == 1)
            {
                System.out.println("Ways to get city number "+travel[i] + " is " + " 1");
            }
            else 
            {
                System.out.println("Ways to get city number "+travel[i] + " is " +ways);
            }
        }
    }
}
