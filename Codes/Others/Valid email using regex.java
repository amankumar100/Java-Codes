// Question: Write a Java program to validate an email address using regex.

import java.util.*;
import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.next();

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);

        if (m.matches()) System.out.println("Valid Email");
        else System.out.println("Invalid Email");

        sc.close();
    }
}