// Question: Write a Java program to implement a simple Queue using LinkedList.

import java.util.*;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            System.out.println("\n1. Enqueue  2. Dequeue  3. Peek  4. Display  5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    queue.offer(val);
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Dequeued: " + queue.poll());
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Front element: " + queue.peek());
                    }
                    break;
                case 4:
                    System.out.println("Queue: " + queue);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
