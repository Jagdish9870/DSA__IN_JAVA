package Graph;

import java.util.ArrayList;

public class BFS {
    int V;
    ArrayList<Integer>[] adj;
    BFS(int noOfVertices){
        V=noOfVertices;
        adj=new ArrayList[V];
        for(int i=0;i<V;i++){
            adj[i]=new ArrayList<>();
        }
    }
    void edge(int x, int y){
        adj[x].add(y);
    }
    void breadthFirstSearch(int sourceV){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> queue = new ArrayList<>();
        visited[sourceV] = true;
        queue.add(sourceV);
        while(!queue.isEmpty()){
            sourceV = queue.remove(0);
            System.out.print(sourceV + " ");
            for(int neighbor : adj[sourceV]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(5);
        graph.edge(0, 1);
        graph.edge(0, 2);
        graph.edge(1, 3);
        graph.edge(1, 4);
        graph.edge(2, 4);
        graph.edge(3, 4);
        
        System.out.println("Breadth First Search starting from vertex 0:");
        graph.breadthFirstSearch(0);
        
    }
    
}
