package StringQues;

public class SwapTwoString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swap: str1 = " + str1 + ", str2 = " + str2);

        // Swapping using concatenation
        str1 = str1 + str2; // Now str1 contains "HelloWorld"
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract original str1
        str1 = str1.substring(str2.length()); // Extract original str2

        System.out.println("After Swap: str1 = " + str1 + ", str2 = " + str2);
    }
    
}

