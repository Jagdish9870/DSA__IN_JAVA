public class NumPat {
    public static void printPattern(int N) {
        // Loop through the rows
        for (int i = 1; i <= N; i++) {
            // Loop through the columns in each row
            for (int j = 1; j <= i; j++) {
                // Print '1' at the start and end, and '2' in the middle
                if (j == 1 || j == i) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 4;  // You can change N to any desired value
        printPattern(N);
    }
}
