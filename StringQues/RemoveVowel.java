package StringQues;
// method 1
// public class RemoveVowel {
//     public static void main(String[] args) {
//         String s = "hello";
//         StringBuilder result = new StringBuilder();
        
//         for (char ch : s.toCharArray()) {
//             if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
//                 result.append(ch);
//             }
//         }
        
//         System.out.println(result.toString());
//     }
    
// }

//method2
public class RemoveVowel {
    public static void removeVowels(String s){

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                System.out.print(ch);
            }
        }
       

    }
    public static void main(String[] args) {
        String s = "hello";
        removeVowels(s);
      
    }
    
}