// Question: Write a Java program to implement A* Algorithm for shortest path.

import java.util.*;

class Node implements Comparable<Node> {
    int vertex, g, h;
    Node parent;

    Node(int v, int g, int h, Node parent) {
        this.vertex = v;
        this.g = g;
        this.h = h;
        this.parent = parent;
    }

    int f() {
        return g + h;
    }

    public int compareTo(Node other) {
        return Integer.compare(this.f(), other.f());
    }
}

public class AStar {
    static int heuristic(int v, int goal) {
        return Math.abs(goal - v);
    }

    static void aStar(int graph[][], int start, int goal) {
        PriorityQueue<Node> open = new PriorityQueue<>();
        boolean[] closed = new boolean[graph.length];
        open.add(new Node(start, 0, heuristic(start, goal), null));

        while (!open.isEmpty()) {
            Node current = open.poll();
            if (current.vertex == goal) {
                System.out.print("Path: ");
                printPath(current);
                System.out.println("\nCost: " + current.g);
                return;
            }
            closed[current.vertex] = true;
            for (int i = 0; i < graph.length; i++) {
                if (graph[current.vertex][i] > 0 && !closed[i]) {
                    int g = current.g + graph[current.vertex][i];
                    int h = heuristic(i, goal);
                    open.add(new Node(i, g, h, current));
                }
            }
        }
        System.out.println("No path found.");
    }

    static void printPath(Node node) {
        if (node == null) return;
        printPath(node.parent);
        System.out.print(node.vertex + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        int graph[][] = new int[V][V];

        System.out.println("Enter adjacency matrix (0 if no edge):");
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        System.out.print("Enter start and goal: ");
        int start = sc.nextInt(), goal = sc.nextInt();

        aStar(graph, start, goal);
        sc.close();
    }
}
