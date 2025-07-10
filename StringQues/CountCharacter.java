package StringQues;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        int length = str.length();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Number of characters in the string: " + count);
        
    }
    
}
