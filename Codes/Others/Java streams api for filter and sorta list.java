// Question: Write a Java program to filter even numbers and sort them using Streams API.

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 5, 20, 3, 15, 8, 12);

        List<Integer> result = nums.stream()
                                   .filter(n -> n % 2 == 0)
                                   .sorted()
                                   .collect(Collectors.toList());

        System.out.println("Filtered & Sorted Even Numbers: " + result);
    }
}