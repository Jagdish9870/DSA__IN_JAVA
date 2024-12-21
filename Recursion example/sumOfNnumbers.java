public class sumOfNnumbers {
    static int f1(int n){
        if(n==1)
        return 1;
        return n+f1(n-1);


    }
   public static void main(String[] args) {
    int usm=f1(10);
    System.out.println(usm);
    
   }
    
}
