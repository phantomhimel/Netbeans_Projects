package javapractisebook;
import java.util.Scanner;
public class CommandLine {

    static Scanner myscanner = new Scanner (System.in);
    public static void main(String[] args) {
     
        System.out.println("Which statement do you want to do?? press \n1. Add\n2. Subtraction\n3. Multiplication\n4. Division");
        short choice = myscanner.nextShort();
        switch(choice)
                {
                    case 1:
                   addition();
                    break;
                
                case 2:
                  subtraction();
                    break;
                
                case 3:
                    multiplication();
                    break;
                
                case 4:
                    division();
                    break;
                 
                 default:
                     System.out.println("sorry");
                     
        }
                 
    
    }
    public static void addition()
    {
                    System.out.println("Enter first number");
                    short fnumber = myscanner.nextShort();
                    System.out.println("Enter second number");
                    short snumber = myscanner.nextShort();
                    short sum = (short) (fnumber+snumber);
                    System.out.println("The addition of your number is " +sum);
    }
    public static void subtraction(){
        System.out.println("Enter first number");
                    short fnumber = myscanner.nextShort();
                    System.out.println("Enter second number");
                    short snumber = myscanner.nextShort();
                    short sub = (short) (fnumber-snumber);
                    System.out.println("The subtraction of your number is " +sub);
    }
    public static void multiplication(){
                    System.out.println("Enter first number");
                    short fnumber = myscanner.nextShort();
                    System.out.println("Enter second number");
                    short snumber = myscanner.nextShort();
                    short mul =  (short) (fnumber*snumber);
                    System.out.println("The multiplication of your number is " +mul);               
    }
    public static void division(){
          System.out.println("Enter first number");
                    short fnumber = myscanner.nextShort();
                    System.out.println("Enter second number");
                    short snumber = myscanner.nextShort();
                    short div = (short) (fnumber/snumber);
                    System.out.println("The division of your number is " +div);
    }
    
    
}
