package NumberQues;

import java.util.Scanner;


//Method 1
// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num=sc.nextInt();
//         while(num!=0){
//             int revNum=num%10;
//             System.out.print(revNum);
//             num=num/10;
//         }
//         sc.close();
//     }
    
// }

// method2
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
       StringBuffer sb=new StringBuffer(String.valueOf(num));
       
        System.out.println("Reversed number is : " + sb.reverse());
        sc.close();
    }
    
}
