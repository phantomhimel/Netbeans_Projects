package contest;
import java.util.Scanner;
public class BinarySearch {

    static Scanner myscanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        StructureOfMain binary[] = new StructureOfMain [100];
        System.out.println("Please enter the array limit");
        int arraylimit = myscanner.nextInt();
        int i;
        int arr[] = new int [arraylimit];
        System.out.println("Enter the values in the array in ascending or descending order");
        for(i=0; i<arraylimit; i++)
        {
            arr[i] = myscanner.nextInt();
        }
        
        System.out.print("Please enter the number to be searched from the array: ");
        int search_number = myscanner.nextInt();
        
        int minimum = 0, maximum = arraylimit-1, middle = (minimum+maximum)/2;
        
        int store =0, found=0;
        
        while(minimum <= maximum)
        {
         //   StructureOfMain binary [store] = new StructureOfMain();
            if(arr[middle]== search_number)
            {
              //  StructureOfMain binary[] = new StructureOfMain[store];
                binary[store].firstNumber = minimum;
                binary[store].lastNumber = maximum;
                binary[store].Mid = arr[middle];
                binary[store].dataFound = true;
                binary[store].midGreat = false;
                binary[store].midLess = false;
            }
        }
    }
    
}
