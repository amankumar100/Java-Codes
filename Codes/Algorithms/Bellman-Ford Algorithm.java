// Question: Write a Java program to implement Bellman-Ford Algorithm.

import java.util.*;

class EdgeBF {
    int src, dest, weight;
}

public class BellmanFord {
    int V, E;
    EdgeBF edge[];

    BellmanFord(int v, int e) {
        V = v; E = e;
        edge = new EdgeBF[e];
        for (int i = 0; i < e; i++) edge[i] = new EdgeBF();
    }

    void bellmanFord(int src) {
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 1; i < V; i++) {
            for (int j = 0; j < E; j++) {
                int u = edge[j].src;
                int v = edge[j].dest;
                int w = edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v])
                    dist[v] = dist[u] + w;
            }
        }

        for (int j = 0; j < E; j++) {
            int u = edge[j].src;
            int v = edge[j].dest;
            int w = edge[j].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                System.out.println("Graph contains negative weight cycle!");
                return;
            }
        }

        System.out.println("Vertex Distance from Source:");
        for (int i = 0; i < V; i++)
            System.out.println(i + " -> " + dist[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and edges: ");
        int V = sc.nextInt(), E = sc.nextInt();
        BellmanFord g = new BellmanFord(V, E);

        System.out.println("Enter edges (src dest weight):");
        for (int i = 0; i < E; i++) {
            g.edge[i].src = sc.nextInt();
            g.edge[i].dest = sc.nextInt();
            g.edge[i].weight = sc.nextInt();
        }

        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();
        g.bellmanFord(src);
        sc.close();
    }
}
