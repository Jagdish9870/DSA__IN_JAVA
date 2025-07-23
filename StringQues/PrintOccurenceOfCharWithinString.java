package StringQues;

public class PrintOccurenceOfCharWithinString {
    public static void main(String[] args) {
        String str = "aaabbcc"; // Example input
        printCharacterOccurrences(str);
    }
    public static void printCharacterOccurrences(String str) {
        StringBuilder result = new StringBuilder();
        int[] count = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }

        // Build the result string with character and its count
        for (char ch : str.toCharArray()) {
            if (count[ch] > 0) {
                result.append(ch).append(count[ch]);
                count[ch] = 0; // Set to 0 to avoid duplicates
            }
        }

        System.out.println("Character occurrences: " + result.toString());
    }
    
}
