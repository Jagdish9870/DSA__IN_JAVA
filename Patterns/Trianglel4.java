import java.util.Scanner;

public class Trianglel4 {
    // triangle 3 and 4 are same but here is one extra space
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");

            }
            for(int j=1;j<i;j++){
                System.out.print("* ");

            }
            System.out.println("");
        }

        
    }
    
}


//     *
//    * *
//   * * *
//  * * * * 