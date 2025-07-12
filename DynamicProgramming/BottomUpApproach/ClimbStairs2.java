package DynamicProgramming.BottomUpApproach;
public class ClimbStairs2 {
    public static int climbStairs(int n){
        int[] dp = new int[n + 1];
        dp[2] = 2;
        dp[1] = 1;
        dp[3]=4;
        for(int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]+ dp[i - 3];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6; 
        System.out.println("Number of ways to climb " + n + " stairs is: " + climbStairs(n));
    }
    
}


// bottom up is iterative approach