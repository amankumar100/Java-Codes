// Question: Write a Java program to perform Topological Sorting using DFS.

import java.util.*;

public class TopologicalSort {
    private int V;
    private LinkedList<Integer> adj[];

    TopologicalSort(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;
        for (int i : adj[v])
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        stack.push(v);
    }

    void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++)
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);

        System.out.println("Topological Order:");
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        TopologicalSort g = new TopologicalSort(V);
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            g.addEdge(sc.nextInt(), sc.nextInt());
        }

        g.topologicalSort();
        sc.close();
    }
}
