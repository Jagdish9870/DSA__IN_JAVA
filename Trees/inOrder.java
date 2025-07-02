package Trees;
class Node3 {
    char key;
    Node3 left, right;

    Node3(char key) {
        this.key = key;
    }
}
class TreeTraverse3 {
    Node3 root;

    void inOrder(Node3 root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }
}

public class inOrder {
    public static void main(String[] args) {
        TreeTraverse3 tree3 = new TreeTraverse3();
        tree3.root = new Node3('A');
        tree3.root.left = new Node3('B');
        tree3.root.right = new Node3('C');
        tree3.root.left.left = new Node3('D');
        tree3.root.left.right = new Node3('E');
        tree3.inOrder(tree3.root);
    }
}
