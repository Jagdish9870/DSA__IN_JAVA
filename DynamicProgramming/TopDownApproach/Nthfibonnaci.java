package DynamicProgramming.TopDownApproach;
public class Nthfibonnaci {
    public static int fib(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int num1= fib(n - 1, dp);
        int num2= fib(n - 2, dp);
        dp[n] = num1 + num2;
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        System.out.println("Fibonacci of " + n + " is: " + fib(n, dp));
    }
}