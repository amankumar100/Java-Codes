// Question: Write a Java program to print all palindrome partitions of a given string.

import java.util.*;

public class PalindromePartition {
    private static boolean isPal(String s, int l, int r) {
        while (l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }

    private static void dfs(String s, int idx, List<String> path, List<List<String>> res) {
        if (idx == s.length()) { res.add(new ArrayList<>(path)); return; }
        for (int end = idx; end < s.length(); end++) {
            if (isPal(s, idx, end)) {
                path.add(s.substring(idx, end + 1));
                dfs(s, end + 1, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        List<List<String>> res = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), res);

        System.out.println("Palindrome partitions:");
        for (List<String> part : res) System.out.println(part);
        sc.close();
    }
}
