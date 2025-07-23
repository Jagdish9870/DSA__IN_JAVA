package NumberQues;

public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // Example input
        int first = 0, second = 1, next;
        System.out.print("Fibonacci Series up to " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
                first = second;
                second = next;
        }

    }
    
}
