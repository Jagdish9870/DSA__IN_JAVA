package StringQues;
public class ReverseStringWord {
    public String reverseWords(String A) {
        // Step 1: Trim leading/trailing spaces and split by 1 or more spaces
        String[] words = A.trim().split("\\s+");

        // Step 2: Reverse the words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    // Test the function
    public static void main(String[] args) {
        ReverseStringWord sol = new ReverseStringWord();
        String input = "   the   sky   is  blue  ";
        String result = sol.reverseWords(input);
        System.out.println("Output: \"" + result + "\"");  // Output: "blue is sky the"
    }
}
