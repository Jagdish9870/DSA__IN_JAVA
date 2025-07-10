package StringQues;
public class RemoveOccurence {
    public String removeConsecutiveChars(String A, int B) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < A.length()) {
            char currentChar = A.charAt(i);
            int count = 1;

            // Count consecutive characters
            int j = i + 1;
            while (j < A.length() && A.charAt(j) == currentChar) {
                count++;
                j++;
            }

            // If count is NOT equal to B, keep them
            if (count != B) {
                for (int k = 0; k < count; k++) {
                    result.append(currentChar);
                }
            }

            i = j; // Move to the next new character
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RemoveOccurence sol = new RemoveOccurence();
        String A = "aaabbbcccbdd";
        int B = 3;
        String result = sol.removeConsecutiveChars(A, B);
        System.out.println("Result: " + result);  // Output: bdd
    }
}
