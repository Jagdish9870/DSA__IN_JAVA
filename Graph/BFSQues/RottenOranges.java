package Graph.BFSQues;

public class RottenOranges {
    public static void minTimeToRot(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int time = 0;
        boolean hasFresh = true;

        while (hasFresh) {
            hasFresh = false;
            int[][] nextGrid = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == 2) {
                        nextGrid[i][j] = 2; // Rotten orange remains rotten
                        // Check adjacent cells
                        if (i > 0 && grid[i - 1][j] == 1) nextGrid[i - 1][j] = 2; // Up
                        if (i < rows - 1 && grid[i + 1][j] == 1) nextGrid[i + 1][j] = 2; // Down
                        if (j > 0 && grid[i][j - 1] == 1) nextGrid[i][j - 1] = 2; // Left
                        if (j < cols - 1 && grid[i][j + 1] == 1) nextGrid[i][j + 1] = 2; // Right
                    } else if (grid[i][j] == 1) {
                        nextGrid[i][j] = 1; // Fresh orange remains fresh
                        hasFresh = true;
                    }
                }
            }

            grid = nextGrid;
            if (hasFresh) time++;
        }

        System.out.println("Time taken to rot all oranges: " + time);
    }
    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 1, 0},
            {2, 1, 0, 0},
            {1, 1, 2, 0},
            {1, 1, 1, 1}
        };
        
         minTimeToRot(grid);
       
    }
    
}
