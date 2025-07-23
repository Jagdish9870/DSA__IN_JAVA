package StringQues;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam"; // Example input
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a Palindrome string.");
        } else {
            System.out.println(str + " is not a Palindrome string.");
        }
    }
    
}
