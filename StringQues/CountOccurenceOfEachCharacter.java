package StringQues;

public class CountOccurenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "hello world"; // Example input
        int[] count = new int[256]; // ASCII character set size

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // Ignore spaces
                count[ch]++;
            }
        }

        System.out.println("Character occurrences:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
    
}
