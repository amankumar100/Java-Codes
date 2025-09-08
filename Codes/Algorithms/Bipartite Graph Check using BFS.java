// Question: Write a Java program to check if a graph is Bipartite using BFS.

import java.util.*;

public class BipartiteCheck {
    static boolean isBipartite(List<List<Integer>> adj, int V) {
        int color[] = new int[V];
        Arrays.fill(color, -1);

        for (int start = 0; start < V; start++) {
            if (color[start] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.add(start);
                color[start] = 0;

                while (!q.isEmpty()) {
                    int u = q.poll();
                    for (int v : adj.get(u)) {
                        if (color[v] == -1) {
                            color[v] = 1 - color[u];
                            q.add(v);
                        } else if (color[v] == color[u]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
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

        System.out.println(isBipartite(adj, V) ? "Graph is Bipartite" : "Graph is NOT Bipartite");
        sc.close();
    }
}