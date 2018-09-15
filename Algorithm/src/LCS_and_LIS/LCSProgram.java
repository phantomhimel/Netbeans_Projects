package LCS_and_LIS;
import java.util.Scanner;
public class LCSProgram {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String str1 = myscanner.next();
		System.out.print("Enter second string: ");
		String str2 = myscanner.next();
		
		
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		int result = lcs.lcsDynamic(str1.toCharArray(), str2.toCharArray());
		System.out.println(result);
		
		myscanner.close();
	}

}
