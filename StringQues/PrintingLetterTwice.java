package StringQues;

public class PrintingLetterTwice {
    public static void main(String[] args) {
        String str = "Hello World!"; // Example input
        String result = printLettersTwice(str);
        System.out.println("String with letters printed twice: " + result);
    }

    public static String printLettersTwice(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            result.append(ch).append(ch);
        }
        return result.toString();
    }

}
