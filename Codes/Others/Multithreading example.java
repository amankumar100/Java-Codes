// Question: Write a Java program to print even and odd numbers using two threads.

import java.util.*;

class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}