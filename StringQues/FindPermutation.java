package StringQues;

public class FindPermutation {
    public static void main(String[] args) {
        String str = "abc"; // Example input
        findPermutations("", str);
    }

    public static void findPermutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                findPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }
    
}
