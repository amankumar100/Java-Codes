// Question: Write a Java program to count the frequency of characters in a string.

import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        sc.close();
    }
}
