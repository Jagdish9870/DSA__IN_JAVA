import java.util.Stack;

public class StackQQ4 {
    public static void main(String[] args) {
        Stack stack= new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.setSize(2);
        System.out.println(stack.size());

        
    }
    
}
