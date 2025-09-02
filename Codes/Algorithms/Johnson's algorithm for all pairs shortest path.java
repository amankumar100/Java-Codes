// Question: Write a Java program to implement Johnson’s Algorithm for All-Pairs Shortest Path.

import java.util.*;

public class JohnsonAlgorithm {
    static final int INF = 99999;

    static void dijkstra(int graph[][], int src) {
        int V = graph.length;
        int dist[] = new int[V];
        boolean sptSet[] = new boolean[V];

        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v] != INF &&
                        dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        System.out.println("Distances from vertex " + src + ": " + Arrays.toString(dist));
    }

    static int minDistance(int dist[], boolean sptSet[]) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < dist.length; v++)
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        int graph[][] = new int[V][V];

        System.out.println("Enter adjacency matrix (use 99999 for INF):");
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        for (int i = 0; i < V; i++) dijkstra(graph, i);
        sc.close();
    }
}
