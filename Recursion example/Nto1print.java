public class Nto1print {
        static void f1(int i,int n){
            if(i<1){
                return;
            }
            System.out.println(i);
            f1(i-1,n);
        }


    public static void main(String[] args) {
        int n=5;
        f1(5,n);
    }
    
}
