// Question: Write a Java program to find Hamiltonian Path in a graph using Backtracking.

import java.util.*;

public class HamiltonianPath {
    final int V = 20;
    int path[];

    boolean isSafe(int v, int graph[][], int path[], int pos) {
        if (graph[path[pos - 1]][v] == 0) return false;
        for (int i = 0; i < pos; i++)
            if (path[i] == v) return false;
        return true;
    }

    boolean hamPathUtil(int graph[][], int path[], int pos, int V) {
        if (pos == V) return true;

        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;
                if (hamPathUtil(graph, path, pos + 1, V)) return true;
                path[pos] = -1;
            }
        }
        return false;
    }

    boolean hamPath(int graph[][], int V) {
        path = new int[V];
        Arrays.fill(path, -1);
        path[0] = 0;

        if (!hamPathUtil(graph, path, 1, V)) {
            System.out.println("No Hamiltonian Path exists");
            return false;
        }

        System.out.println("Hamiltonian Path:");
        for (int i = 0; i < V; i++)
            System.out.print(path[i] + " ");
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        int graph[][] = new int[V][V];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        HamiltonianPath h = new HamiltonianPath();
        h.hamPath(graph, V);
        sc.close();
    }
}
