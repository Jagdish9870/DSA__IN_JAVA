package StringQues;

public class UniqueChar {
    public static void main(String[] args) {
        String str = "hello"; // Example input
        boolean hasUniqueChars = hasAllUniqueChars(str);
        
        if (hasUniqueChars) {
            System.out.println("The string \"" + str + "\" has all unique characters.");
        } else {
            System.out.println("The string \"" + str + "\" does not have all unique characters.");
        }
    }

    public static boolean hasAllUniqueChars(String str) {
        boolean[] charSet = new boolean[256]; // Assuming ASCII
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charSet[ch]) {
                return false; // Character already found
            }
            charSet[ch] = true;
        }
        return true;
    }
}
