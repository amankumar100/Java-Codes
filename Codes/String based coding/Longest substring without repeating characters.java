// Question: Write a Java program to find the length of the longest substring without repeating characters.

import java.util.*;

public class LongestSubstring {
    public static int longestUniqueSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, maxLen = 0;

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Longest substring length: " + longestUniqueSubstring(str));
        sc.close();
    }
}
