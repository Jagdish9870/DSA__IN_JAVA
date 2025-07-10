package StringQues;

import java.util.Scanner;

   // method #1
// public class ReverseEachWordInString {
//     public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = scanner.nextLine();
//         String[] words = str.split(" ");
//         String reversedString = "";


     
        
//         for (String word : words) {
//             String reversedWord = "";
//             for (int i = word.length() - 1; i >= 0; i--) {
//                 reversedWord += word.charAt(i);
//             }
//             reversedString += reversedWord + " ";
//         }
        
//         System.out.println("Reversed String: " + reversedString.trim());
//     }
    
// }

   // method #2
   public class ReverseEachWordInString {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        String reversedString = "";


     
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();

            reversedString = reversedString + reversedWord.toString() + " ";
        }
        
        System.out.println("Reversed String: " + reversedString.trim());
    }
    
}