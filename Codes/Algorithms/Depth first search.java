// Question: Write a Java program to implement Depth First Search (DFS) on a graph.

import java.util.*;

public class DFS {
    private LinkedList<Integer> adj[];

    DFS(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void dfsUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n]) dfsUtil(n, visited);
        }
    }

    void dfs(int v) {
        boolean visited[] = new boolean[adj.length];
        dfsUtil(v, visited);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        DFS graph = new DFS(V);

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        System.out.print("Enter start vertex: ");
        int start = sc.nextInt();

        System.out.println("DFS traversal:");
        graph.dfs(start);
        sc.close();
    }
}
