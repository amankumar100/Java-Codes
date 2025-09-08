// Question: Write a Java program to implement Edmonds-Karp algorithm for Maximum Flow.

import java.util.*;

public class MaxFlow {
    static final int INF = Integer.MAX_VALUE;

    static boolean bfs(int rGraph[][], int s, int t, int parent[]) {
        boolean visited[] = new boolean[rGraph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 0; v < rGraph.length; v++) {
                if (!visited[v] && rGraph[u][v] > 0) {
                    parent[v] = u;
                    visited[v] = true;
                    if (v == t) return true;
                    q.add(v);
                }
            }
        }
        return false;
    }

    static int edmondsKarp(int graph[][], int s, int t) {
        int u, v;
        int V = graph.length;
        int rGraph[][] = new int[V][V];
        for (u = 0; u < V; u++)
            for (v = 0; v < V; v++)
                rGraph[u][v] = graph[u][v];

        int parent[] = new int[V];
        int maxFlow = 0;

        while (bfs(rGraph, s, t, parent)) {
            int pathFlow = INF;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                pathFlow = Math.min(pathFlow, rGraph[u][v]);
            }
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                rGraph[u][v] -= pathFlow;
                rGraph[v][u] += pathFlow;
            }
            maxFlow += pathFlow;
        }
        return maxFlow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        int graph[][] = new int[V][V];
        System.out.println("Enter adjacency matrix (capacities):");
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        System.out.print("Enter source and sink: ");
        int s = sc.nextInt(), t = sc.nextInt();

        System.out.println("Maximum Flow: " + edmondsKarp(graph, s, t));
        sc.close();
    }
}