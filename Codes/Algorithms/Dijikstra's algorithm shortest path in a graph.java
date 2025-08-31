// Question: Write a Java program to implement Dijkstra's Algorithm for shortest paths.

import java.util.*;

class Dijkstra {
    private int vertices;
    private int[][] graph;

    public Dijkstra(int v) {
        vertices = v;
        graph = new int[v][v];
    }

    public void addEdge(int src, int dest, int weight) {
        graph[src][dest] = weight;
    }

    public void shortestPath(int start) {
        int[] dist = new int[vertices];
        boolean[] visited = new boolean[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 &&
                    dist[u] != Integer.MAX_VALUE &&
                    dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " \t " + dist[i]);
        }
    }

    private int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < vertices; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
}

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        Dijkstra d = new Dijkstra(v);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
        System.out.println("Enter edges (src dest weight):");
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();
            d.addEdge(src, dest, weight);
        }

        System.out.print("Enter source vertex: ");
        int start = sc.nextInt();
        d.shortestPath(start);

        sc.close();
    }
}
