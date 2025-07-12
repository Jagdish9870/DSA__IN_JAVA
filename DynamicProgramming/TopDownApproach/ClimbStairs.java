package DynamicProgramming.TopDownApproach;


public class ClimbStairs {
    public static int climbStairs(int n, int[] dp) {
        if (n <= 2) {
            return n;
        }
        if(n==3){
            return 4; // Base case for 3 stairs
    }
        if (dp[n] != 0) {
            return dp[n];
        }
        int num1= climbStairs(n - 1, dp);
        int num2= climbStairs(n - 2, dp);
        int num3= climbStairs(n - 3, dp); // Adding the case for 3 stairs
        dp[n] = num1 + num2+ num3;
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        System.out.println("Number of ways to climb " + n + " stairs is: " + climbStairs(n, dp));
    }
}