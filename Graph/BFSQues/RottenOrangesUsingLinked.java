package Graph.BFSQues;

import java.util.LinkedList;

public class RottenOrangesUsingLinked {
    public static int TimeToRot(int[][] grid) {
        LinkedList<int[]> queue = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 2) {
                    int temp[]={i,j,0} ;
                    queue.add(temp);
                }
            }
        }
        int ans = 0;
        // BFS to rot all oranges
        while (queue.size() > 0) {
            int[] current = queue.removeFirst();
            int x = current[0];
            int y = current[1];
            int time = current[2];
            ans=time;
           if(x+1<grid.length   &&grid[x+1][y]==1){
            int[] temp = new int[]{x+1,y,time+1};
            queue.add(temp);
            grid[x+1][y]=2;
           }
           if(x-1>=0   &&grid[x-1][y]==1){
               int[] temp = new int[]{x-1,y,time+1};
               queue.add(temp); 
               grid[x-1][y]=2;
           }
           if(y+1<grid[0].length   &&grid[x][y+1]==1){
               int[] temp = new int[]{x,y+1,time+1};
               queue.add(temp);
               grid[x][y+1]=2;
               }
           if(y-1>=0   &&grid[x][y-1]==1){
               int[] temp = new int[]{x,y-1,time+1};
               queue.add(temp);
               grid[x][y-1]=2;
           }
            
        }
        // Check if there are any fresh oranges left
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    System.out.println("Not all oranges can rot.");
                    return -1; // Not all oranges can rot
                }
            }
        }
        return ans;
       
    }
    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 1, 0},
            {2, 1, 0, 0},
            {1, 1, 2, 0},
            {1, 1, 1, 1}
        };

         System.out.println("Time taken to rot all oranges: " + TimeToRot(grid));

    }
    
}
