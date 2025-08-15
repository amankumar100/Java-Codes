// Question: Write a Java program to check if parentheses in a string are balanced using a stack.

import java.util.*;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are not balanced.");
        }
        sc.close();
    }
}
