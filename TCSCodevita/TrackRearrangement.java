import java.util.*;

public class TrackRearrangement {
    
    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        
        char[][] grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine().trim();
            grid[i] = line.toCharArray();
        }
        
        Point start = null, end = null;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'S') start = new Point(i, j);
                if (grid[i][j] == 'D') end = new Point(i, j);
            }
        }
        
        int shortestDistance = bfs(grid, start, end);
        
        System.out.println(shortestDistance);
    }
    
    private static int bfs(char[][] grid, Point start, Point end) {
        int N = grid.length;
        boolean[][] visited = new boolean[N][N];
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;
        
        int distance = 0;
        
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point current = queue.poll();
                
                if (current.x == end.x && current.y == end.y) {
                    return distance + 1;
                }
                
                for (int[] dir : directions) {
                    int newX = current.x + dir[0];
                    int newY = current.y + dir[1];
                    
                    if (isValidMove(grid, newX, newY, visited)) {
                        visited[newX][newY] = true;
                        queue.add(new Point(newX, newY));
                    }
                }
            }
            distance++;
        }
        
        return -1;
    }
    
    private static boolean isValidMove(char[][] grid, int x, int y, boolean[][] visited) {
        int N = grid.length;
        
        return x >= 0 && x < N && y >= 0 && y < N && 
               !visited[x][y] && 
               (grid[x][y] == 'T' || grid[x][y] == 'D');
    }
}