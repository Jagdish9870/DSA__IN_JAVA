package StringQues;

public class CountDuplicateInString {
    public static void main(String[] args) {
        String str = "hello world"; // Example input
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
    
}
 