package Graph;
import java.util.ArrayList;
import java.util.Stack;



public class DFS {
    int V; // Number of vertices
    ArrayList<Integer>[] adj; // Adjacency list representation of the graph
    DFS(int noOfVertices) {
        V = noOfVertices;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    void edge(int x, int y) {
        adj[x].add(y);
    }

    void depthFirstSearch(int sourceV) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(sourceV);
        int nodeV;
        while(!stack.isEmpty()){
            sourceV = stack.peek();
            stack.pop();
           for(int i=0;i<adj[sourceV].size();i++){
                nodeV = adj[sourceV].get(i);
                if(!visited[nodeV]){
                    
                    stack.push(nodeV);
                }
            }
            if(visited[sourceV]==false) {
                System.out.print(sourceV + " ");
                visited[sourceV] = true; // Mark the node as visited
               }

        }
    }

    public static void main(String[] args) {
        
        DFS graph = new DFS(5);
        graph.edge(0, 1);
        graph.edge(0, 2);
        graph.edge(1, 3);
        graph.edge(1, 4);
        graph.edge(2, 4);
        graph.edge(3, 4);
        
        System.out.println("Depth First Search starting from vertex 0:");
        graph.depthFirstSearch(0);
    }
    
}
