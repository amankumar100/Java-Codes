// Question: Write a Java program to find all Buzz numbers between two integers.

import java.util.*;

public class BuzzRange {
    public static boolean isBuzz(int num) {
        if(num%7==0 || num%10==7)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Buzz numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isBuzz(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
