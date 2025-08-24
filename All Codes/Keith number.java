// Question: Write a Java program to check if a number is a Keith number.

import java.util.*;

public class KeithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String s = String.valueOf(num);
        int d = s.length();
        int[] terms = new int[d];

        for (int i = 0; i < d; i++) {
            terms[i] = s.charAt(i) - '0';
        }

        int sum = 0, index = d;
        while (sum < num) {
            sum = 0;
            for (int i = index - d; i < index; i++) sum += terms[i];
            terms = Arrays.copyOf(terms, terms.length + 1);
            terms[index] = sum;
            index++;
        }

        if (sum == num) {
            System.out.println(num + " is a Keith number.");
        } else {
            System.out.println(num + " is not a Keith number.");
        }
        sc.close();
    }
}
