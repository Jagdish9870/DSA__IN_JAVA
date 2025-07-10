package StringQues;

import java.util.Scanner;

// #method1
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        int length = str.length();
        String revString = " ";
        for(int i=length-1;i>=0;i--){
            revString = revString + str.charAt(i);
        }
        System.out.println("Reversed String is : " + revString);
        scanner.close();
    }
    
}


//#Method 2
// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = scanner.nextLine();
//         char c[]=str.toCharArray();
//         int length = str.length();
//         String revString = " ";
//         for(int i=length-1;i>=0;i--){
//             revString = revString + c[i];
//         }
//         System.out.println("Reversed String is : " + revString);
//         scanner.close();
//     }
    
// }
// //#Method 3
// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = scanner.nextLine();
//        StringBuffer sb = new StringBuffer(str);
//         System.out.println("Reversed String is : " + sb.reverse());
//         scanner.close();
//     }
    
// }