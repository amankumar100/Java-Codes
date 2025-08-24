// Question: Write a Java program to check if a number is a Trimorphic number.

import java.util.*;

public class TrimorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int cube = num * num * num;
        String strNum = String.valueOf(num);
        String strCube = String.valueOf(cube);

        if (strCube.endsWith(strNum)) {
            System.out.println(num + " is a Trimorphic number.");
        } else {
            System.out.println(num + " is not a Trimorphic number.");
        }
        sc.close();
    }
}
