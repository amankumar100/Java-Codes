// Question: Write a Java program to implement a Trie with insert and search operations.

import java.util.*;

class TrieNode {
    TrieNode children[] = new TrieNode[26];
    boolean isEndOfWord;
    TrieNode() { isEndOfWord = false; }
}

public class Trie {
    static TrieNode root = new TrieNode();

    static void insert(String key) {
        TrieNode node = root;
        for (char c : key.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) node.children[index] = new TrieNode();
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    static boolean search(String key) {
        TrieNode node = root;
        for (char c : key.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) return false;
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        insert("hello");
        insert("world");
        insert("java");

        System.out.print("Enter word to search: ");
        String key = sc.next();
        System.out.println(search(key) ? "Found" : "Not Found");
        sc.close();
    }
}
