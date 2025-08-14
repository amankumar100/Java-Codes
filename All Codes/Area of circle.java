// Question: Write a Java program to calculate the area of a circle given its radius.

import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        sc.close();
    }
}
