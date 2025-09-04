// Question: Write a Java program to find Articulation Points in a graph.

import java.util.*;

public class ArticulationPoint {
    static int time = 0;

    static void dfs(int u, boolean visited[], int disc[], int low[], int parent[], boolean ap[], List<List<Integer>> adj) {
        int children = 0;
        visited[u] = true;
        disc[u] = low[u] = ++time;

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                children++;
                parent[v] = u;
                dfs(v, visited, disc, low, parent, ap, adj);

                low[u] = Math.min(low[u], low[v]);

                if (parent[u] == -1 && children > 1)
                    ap[u] = true;
                if (parent[u] != -1 && low[v] >= disc[u])
                    ap[u] = true;
            } else if (v != parent[u])
                low[u] = Math.min(low[u], disc[v]);
        }
    }

    static void findAPs(int V, List<List<Integer>> adj) {
        boolean visited[] = new boolean[V];
        int disc[] = new int[V];
        int low[] = new int[V];
        int parent[] = new int[V];
        boolean ap[] = new boolean[V];
        Arrays.fill(parent, -1);

        for (int i = 0; i < V; i++)
            if (!visited[i]) dfs(i, visited, disc, low, parent, ap, adj);

        System.out.println("Articulation Points:");
        for (int i = 0; i < V; i++)
            if (ap[i]) System.out.print(i + " ");
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

        findAPs(V, adj);
        sc.close();
    }
}
