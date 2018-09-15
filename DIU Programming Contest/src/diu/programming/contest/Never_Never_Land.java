package diu.programming.contest;
import java. util.Scanner;
public class Never_Never_Land {
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter answer string");
        String str = myscanner.next();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)== 'n')
                
            {
                count++;
            }
        }
        
        System.out.println("n found "+count+" times");
    }
}
