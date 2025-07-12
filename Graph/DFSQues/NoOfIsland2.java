package Graph.DFSQues;
//method2
public class NoOfIsland2 {
    public static void dfs(int[][] grid, int i, int j) {
       

        // Mark the cell as visited
        grid[i][j] = 0;

        // Explore all 4 directions
        if(i+1<grid.length && grid[i + 1][j] == 1) // Down
            dfs(grid, i + 1, j);
        if(i-1>=0 && grid[i - 1][j] == 1) // Up
            dfs(grid, i - 1, j);
        if(j+1<grid[0].length && grid[i][j + 1] == 1) // Right
            dfs(grid, i, j + 1);
        if(j-1>=0 && grid[i][j - 1] == 1) // Left
            dfs(grid, i, j - 1);
    }
    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 1, 0},
            {0, 1, 1, 0, 0},
            {1, 0, 0, 0, 1}
        };
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    ans++;
                }
            }
        }
        System.out.println("Number of islands: " + ans);

    }
    
}
