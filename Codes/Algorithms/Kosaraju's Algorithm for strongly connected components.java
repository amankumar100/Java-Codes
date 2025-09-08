// Question: Write a Java program to find Strongly Connected Components using Kosaraju's algorithm.

import java.util.*;

public class Kosaraju {
    static void dfs(int v, boolean visited[], Stack<Integer> stack, List<List<Integer>> adj) {
        visited[v] = true;
        for (int u : adj.get(v))
            if (!visited[u]) dfs(u, visited, stack, adj);
        stack.push(v);
    }

    static void dfsUtil(int v, boolean visited[], List<List<Integer>> adj) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int u : adj.get(v))
            if (!visited[u]) dfsUtil(u, visited, adj);
    }

    static void printSCCs(int V, List<List<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++)
            if (!visited[i]) dfs(i, visited, stack, adj);

        List<List<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < V; i++) transpose.add(new ArrayList<>());
        for (int i = 0; i < V; i++)
            for (int j : adj.get(i)) transpose.get(j).add(i);

        Arrays.fill(visited, false);
        System.out.println("Strongly Connected Components:");
        while (!stack.isEmpty()) {
            int v = stack.pop();
            if (!visited[v]) {
                dfsUtil(v, visited, transpose);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and edges: ");
        int V = sc.nextInt(), E = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        System.out.println("Enter directed edges (u v):");
        for (int i = 0; i < E; i++) adj.get(sc.nextInt()).add(sc.nextInt());

        printSCCs(V, adj);
        sc.close();
    }
}