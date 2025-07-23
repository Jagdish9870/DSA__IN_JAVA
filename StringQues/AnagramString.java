package StringQues;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen"; // Example input
        String str2 = "silent"; // Example input

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not Anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[256]; // Assuming ASCII characters
for(int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        // If all counts are zero, they are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
