package DynamicProgramming.TopDownApproach;

public class MinpathSum {
    public static int minPathSum(int[][] grid,int i, int j, int[][] dp) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }
        if (i >= grid.length || j >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int right = minPathSum(grid, i, j + 1, dp);
        int bottom = minPathSum(grid, i + 1, j, dp);

        dp[i][j] = grid[i][j] + Math.min(right, bottom);
        return dp[i][j];
      
    }
    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        int dp[][] = new int[grid.length][grid[0].length];
        System.out.println("Minimum path sum is: " + minPathSum(grid, 0, 0, dp));
    }
    
}
