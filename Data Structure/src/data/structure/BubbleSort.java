package data.structure;

import java.util.Scanner;
public class BubbleSort {
    
    public static void main (String [] args)
    {
        Scanner myscanner = new Scanner (System.in);
        int loop,arraylimit,store,swap;
        System.out.println("Please enter the limit of the array");
        arraylimit = myscanner.nextInt();
        int array1[] = new int [arraylimit];
        System.out.println("Please enter the vlaues in the array to sort");
        for(int i=0; i<arraylimit; i++)
        {
            array1[i]=myscanner.nextInt();
        }
        int temp,i;
        for( i=0; i<arraylimit; i++)
        {
            int ptr=0;
            while (ptr<=arraylimit-1-i)
            {
                if (array1[ptr]< array1[ptr+1])
                {
                    temp = array1[ptr];
                    array1[ptr]= array1[ptr+1];
                    array1[ptr+1]= temp;
                }
                ptr++;
            }
        }
        System.out.print("Your sorted array is below\n");
        for(int number: array1)
        {
            System.out.println(number +" ");
        }
    }
    
}
