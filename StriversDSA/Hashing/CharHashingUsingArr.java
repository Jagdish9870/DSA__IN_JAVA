
package StriversDSA.Hashing;

import java.util.Scanner;

public class CharHashingUsingArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read input string
        System.out.println("Enter string in lowercase letters:");
        String str = sc.nextLine();

        // Step 2: Precompute frequencies using hashing
        int[] hash = new int[26]; // Only for 'a' to 'z'
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                hash[ch - 'a'] += 1;
            }
        }

        // Step 3: Read query characters in one line
        System.out.println("Enter query characters (space-separated):");
        String[] queries = sc.nextLine().split(" ");

        // Step 4: Process each query
        for (String q : queries) {
            if (q.length() == 1) {
                char ch = q.charAt(0);
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Count of '" + ch + "' is: " + hash[ch - 'a']);
                } else {
                    System.out.println("Invalid query: '" + ch + "' is not a lowercase letter.");
                }
            } else {
                System.out.println("Invalid query: '" + q + "' is not a single character.");
            }
        }

        sc.close();
    }
}
