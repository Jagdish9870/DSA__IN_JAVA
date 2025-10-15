package StringQues;


public class PangramSimple {

    public static boolean isPangram(String s) {
        s = s.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) { 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "Hello World";

        System.out.println(str1 + " -> " + isPangram(str1)); // true
        System.out.println(str2 + " -> " + isPangram(str2)); // false
    }
}
