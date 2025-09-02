// Question: Write a Java program to implement Ford-Fulkerson Algorithm for Maximum Flow in a graph.

import java.util.*;

public class FordFulkerson {
    static final int V = 20;

    boolean bfs(int rGraph[][], int s, int t, int parent[]) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 0; v < V; v++) {
                if (!visited[v] && rGraph[u][v] > 0) {
                    if (v == t) {
                        parent[v] = u;
                        return true;
                    }
                    q.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }
        return false;
    }

    int fordFulkerson(int graph[][], int s, int t, int n) {
        int u, v;
        int rGraph[][] = new int[n][n];
        for (u = 0; u < n; u++)
            for (v = 0; v < n; v++)
                rGraph[u][v] = graph[u][v];

        int parent[] = new int[n];
        int max_flow = 0;

        while (bfs(rGraph, s, t, parent)) {
            int path_flow = Integer.MAX_VALUE;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                path_flow = Math.min(path_flow, rGraph[u][v]);
            }

            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                rGraph[u][v] -= path_flow;
                rGraph[v][u] += path_flow;
            }

            max_flow += path_flow;
        }
        return max_flow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        int graph[][] = new int[V][V];

        System.out.println("Enter capacity matrix:");
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        System.out.print("Enter source and sink: ");
        int s = sc.nextInt(), t = sc.nextInt();

        FordFulkerson ff = new FordFulkerson();
        System.out.println("Maximum Flow: " + ff.fordFulkerson(graph, s, t, V));
        sc.close();
    }
}
