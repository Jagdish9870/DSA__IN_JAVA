package NumberQues;

public class NumOfDigit {
    public static void main(String[] args) {
        int number = 12345; // Example input
        int count = 0;

        while (number != 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the digit count
        }

        System.out.println("Number of digits: " + count);
    }
    
}
