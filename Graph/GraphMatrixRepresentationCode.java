package Graph;

import java.util.Scanner;

public class GraphMatrixRepresentationCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();
        int[][] graph = new int[vertices][vertices];

        for(int i=0;i<edges;i++) {
            System.out.print("Enter edge (u v): ");
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph[u][v] = 1; // Directed graph
            graph[v][u] = 1; // Uncomment this line for undirected graph
        }
        System.out.println("Adjacency Matrix Representation of the Graph:");
        for(int i=0;i<vertices;i++) {   
            for(int j=0;j<vertices;j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
