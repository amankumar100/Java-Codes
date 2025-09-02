// Question: Write a Java program to check whether a graph has an Euler Path or Euler Circuit.

import java.util.*;

public class EulerPathCircuit {
    int V;
    LinkedList<Integer>[] adj;

    EulerPathCircuit(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) adj[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    int isEulerian() {
        int odd = 0;
        for (int i = 0; i < V; i++)
            if (adj[i].size() % 2 != 0)
                odd++;

        if (odd == 0) return 2; // Euler Circuit
        else if (odd == 2) return 1; // Euler Path
        else return 0; // Not Eulerian
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        EulerPathCircuit g = new EulerPathCircuit(V);
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) g.addEdge(sc.nextInt(), sc.nextInt());

        int res = g.isEulerian();
        if (res == 0) System.out.println("Graph is NOT Eulerian.");
        else if (res == 1) System.out.println("Graph has an Euler Path.");
        else System.out.println("Graph has an Euler Circuit.");
        sc.close();
    }
}
