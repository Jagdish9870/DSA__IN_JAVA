package NumberQues;

public class SwapwithoutThirdNum {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5 (15 - 10)
        a = a - b; // a becomes 10 (15 - 5)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
}
