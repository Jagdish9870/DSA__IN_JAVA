public class Nto1withBacktracking {
    static void f1(int i, int n){
        if(i==n){
            return ;

        }
        f1(i+1,n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        f1(1,10);
        
    }
    
}
