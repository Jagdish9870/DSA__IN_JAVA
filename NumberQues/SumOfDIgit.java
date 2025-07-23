package NumberQues;

public class SumOfDIgit {
    public static void main(String[] args) {
        int number = 12345; // Example input
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit; // Summing the digit
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
    
}
