package Graph;

import java.util.*;

public class GraphListRepresentationCode {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int edges = sc.nextInt();
        // Create an adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        // Read edges and populate the adjacency list
        for (int i = 0; i < edges; i++) {
            System.out.print("Enter edge (u v): ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v); // Directed graph
             graph.get(v).add(u); // Uncomment this line for undirected graph
        }
        // Print the adjacency list representation of the graph
        System.out.println("Adjacency List Representation of the Graph:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int j : graph.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
