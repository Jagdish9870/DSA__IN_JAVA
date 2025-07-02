package Trees;
class Node2{
    Node2 left, right;
    char key;
    Node2(char key) {
        this.key = key;
    }
}
class TreeTraverse2 {
    Node2 root;
    void postOrder(Node2 root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }
}

public class postOrder {
    public static void main(String[] args) {
        TreeTraverse2 tree2 = new TreeTraverse2();
        tree2.root = new Node2('A');
        tree2.root.left = new Node2('B');
        tree2.root.right = new Node2('C');
        tree2.root.left.left = new Node2('D');
        tree2.root.left.right = new Node2('E');
        tree2.postOrder(tree2.root);
    }
    
}
