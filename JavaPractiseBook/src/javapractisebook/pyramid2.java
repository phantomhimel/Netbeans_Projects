package javapractisebook;
import java.util.Scanner;
public class pyramid2 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter row number");
        short row= myscanner.nextShort();
        try{
        for(short i=1; i<=row; i++)
        {
            for(short j= 1; j<=row; j++)
            {
                if(j>= row+1-i)
                {
                    System.out.print(i+" ");
                }
                else{
                System.out.print(" ");}
            }
            System.out.println("");
        }
        
        }
        catch(Exception e){
            System.out.println("Sorry");
            
        }
    }
    
}
