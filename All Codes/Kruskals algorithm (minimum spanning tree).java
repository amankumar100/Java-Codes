// Question: Write a Java program to implement Kruskal's Algorithm for MST.

import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

class Subset {
    int parent, rank;
}

public class Kruskal {
    int V, E;
    Edge edge[];

    Kruskal(int v, int e) {
        V = v; E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i) edge[i] = new Edge();
    }

    int find(Subset subsets[], int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    void union(Subset subsets[], int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    void kruskalMST() {
        Edge result[] = new Edge[V];
        int e = 0;
        for (int i = 0; i < V; ++i) result[i] = new Edge();

        Arrays.sort(edge);
        Subset subsets[] = new Subset[V];
        for (int i = 0; i < V; ++i) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

        int i = 0;
        while (e < V - 1 && i < E) {
            Edge next = edge[i++];
            int x = find(subsets, next.src);
            int y = find(subsets, next.dest);

            if (x != y) {
                result[e++] = next;
                union(subsets, x, y);
            }
        }

        System.out.println("Edges in MST:");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src + " - " + result[i].dest + " : " + result[i].weight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and edges: ");
        int V = sc.nextInt(), E = sc.nextInt();
        Kruskal graph = new Kruskal(V, E);

        System.out.println("Enter edges (src dest weight):");
        for (int i = 0; i < E; i++) {
            graph.edge[i].src = sc.nextInt();
            graph.edge[i].dest = sc.nextInt();
            graph.edge[i].weight = sc.nextInt();
        }

        graph.kruskalMST();
        sc.close();
    }
}
