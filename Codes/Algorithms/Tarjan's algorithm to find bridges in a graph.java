// Question: Write a Java program to find Bridges in a graph.

import java.util.*;

public class Bridges {
    static int time = 0;

    static void dfs(int u, boolean visited[], int disc[], int low[], int parent[], List<List<Integer>> adj) {
        visited[u] = true;
        disc[u] = low[u] = ++time;

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                parent[v] = u;
                dfs(v, visited, disc, low, parent, adj);

                low[u] = Math.min(low[u], low[v]);

                if (low[v] > disc[u])
                    System.out.println(u + " - " + v + " is a Bridge");
            } else if (v != parent[u])
                low[u] = Math.min(low[u], disc[v]);
        }
    }

    static void findBridges(int V, List<List<Integer>> adj) {
        boolean visited[] = new boolean[V];
        int disc[] = new int[V];
        int low[] = new int[V];
        int parent[] = new int[V];
        Arrays.fill(parent, -1);

        for (int i = 0; i < V; i++)
            if (!visited[i]) dfs(i, visited, disc, low, parent, adj);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and edges: ");
        int V = sc.nextInt(), E = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        findBridges(V, adj);
        sc.close();
    }
}
