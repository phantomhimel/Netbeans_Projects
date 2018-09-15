package data.structure;
import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections;
public class BinarySearchWithTraceTable {

    static Scanner myscanner = new Scanner (System.in);
    public static void main(String[] args) {

        System.out.print("Please enter the array limit: ");
        int arraylimit = myscanner.nextInt();
        System.out.println("Enter the values in your array below");
        int loop;
        int array1[] = new int [arraylimit];
        for(loop=0; loop<arraylimit; loop++)
        {
            array1[loop]=myscanner.nextInt();
        }
        
        Arrays.sort(array1);
        
        System.out.println("Your ascending order sorted array is");
        for(loop=0; loop<arraylimit; loop++)
        {
            System.out.print(array1[loop]+" ");
        }
       // Arrays.sort(array1,Collections.reverseOrder());
       System.out.print("\nPlease enter the number you want to search: ");
       int search = myscanner .nextInt();
       int minimum=0, maximum= arraylimit-1, middle = (minimum+maximum)/2;
       int found=0;
      // String array2[]={"True", "False"};
      boolean yes = true;
      boolean no = false;
       System.out.println("First\tLast\tMid\tData");
       System.out.println("______________________________\n");
       while (minimum<= maximum)
       {
           if (array1[middle]== search)
           {
               found=1;
               System.out.printf("%d\t%d\t%d\t%s\n", minimum, maximum, middle, yes);
               System.out.println("\nYour searching number " +search+ " is found at the position "+(middle+1));
               break;
           }
           else if (array1[middle]<search)
           {
               System.out.printf("%d\t%d\t%d\t%s\n", minimum, maximum, middle, no);
               minimum= middle+1;
               middle = (minimum+maximum)/2;
           }
           else 
           {
               System.out.printf("%d\t%d\t%d\t%s\n", minimum, maximum, middle, no);
               maximum = middle -1;
               middle = (minimum + maximum)/2;
           }
       }
       
       if (found==0)
       {
           System.out.println("Sorry. the searching number is not found in the array.");
       }
       }
    }
