public class NtimeswithBcktracking {
    static void f1(int i, int n){
        if(i<1)
        return;
        f1(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        f1(5,n);

    }
    
    
}
