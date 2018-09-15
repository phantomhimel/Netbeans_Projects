package javapractisebook;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner (System.in);
        System.out.println("Enter the first size");
        short boob = myscanner.nextShort();
        System.out.println("Enter second size");
        short waist = myscanner.nextShort();
        System.out.println("Enter booty size");
        short booty = myscanner.nextShort();
        
        if(boob==34)
        {
            if(waist==30)
            {
                if(booty==38)
                {
                    System.out.println("Sexy body");
                }
                else
                {
                    System.out.println("Not a sexy body");
                }
            }
            else 
            {
                System.out.println("Not a good waist");
            }
        }
        else
        {
            System.out.println("Small boobs");
        }
        myscanner.close();
    }
    
}
