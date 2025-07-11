package HashSet.Ques;

import java.util.HashSet;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
       findFirstRepeatingChar(str);
       
    }

    public static void findFirstRepeatingChar(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                System.out.println("First repeating character: " + ch);
                return;
            } else {
                set.add(ch);
            }
        }
        System.out.println("No repeating characters found.");
    }
    
}
