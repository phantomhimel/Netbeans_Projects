package diu.programming.contest;

import java.util.Scanner;

public class Common_Id {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("How many id?");
        int id = myscanner.nextInt();
        int group1[] = new int[id];
        int group2[] = new int[id];
        int count = 0;

        System.out.println("Enter first group id");

        for (int j = 0; j < id; j++) {
            group1[j] = myscanner.nextInt();
        }

        System.out.println("Enter second group id");

        for (int j = 0; j < id; j++) {
            group2[j] = myscanner.nextInt();
        }

        for (int k = 0; k < id; k++) {
            for (int i = 0; i < id; i++) {
                if (group1[k] == group2[i]) {
                    count++;
                }
            }
        }

        System.out.println("Total common id is " + count);
    }
}
