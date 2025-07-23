package StringQues;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming"; // Example input
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
    
}
