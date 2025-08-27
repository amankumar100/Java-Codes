// Question: Write a Java program to perform Kaprekar's 6174 process for a 4-digit number

import java.util.*;

public class Kaprekar6174 {
    private static String pad4(int x) { return String.format("%04d", x); }

    private static int step(int x) {
        char[] a = pad4(x).toCharArray();
        Arrays.sort(a);
        int asc = Integer.parseInt(new String(a));
        StringBuilder sb = new StringBuilder(new String(a)).reverse();
        int desc = Integer.parseInt(sb.toString());
        return desc - asc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number (>=2 distinct digits): ");
        int n = sc.nextInt();

        String s = pad4(n);
        if (new HashSet<Character>() {{ for (char c : s.toCharArray()) add(c); }}.size() < 2) {
            System.out.println("Invalid input: needs at least two distinct digits.");
            sc.close();
            return;
        }

        int count = 0;
        while (n != 6174) {
            int next = step(n);
            System.out.println(pad4(n) + " -> " + pad4(next));
            n = next;
            count++;
            if (count > 20) { // safety
                System.out.println("Exceeded expected steps. Stopping.");
                sc.close();
                return;
            }
        }
        System.out.println("Reached 6174 in " + count + " step(s).");
        sc.close();
    }
}
