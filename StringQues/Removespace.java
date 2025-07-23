package StringQues;

public class Removespace {
    public static void main(String[] args) {
        String str = "Hello World! This is a test string."; // Example input
        String result = removeSpaces(str);
        System.out.println("String without spaces: " + result);
    }

    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

}
