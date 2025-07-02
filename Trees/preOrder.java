package Trees;

class Node{
    char key;
    Node left,right;
    Node(char key){
        this.key=key;
    }
}
class TreeTraverse{
    Node root;
    void preOrder(Node root){
        if(root !=null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}

public class preOrder {
    public static void main(String[] args) {
        TreeTraverse tree=new TreeTraverse();
        tree.root=new Node('A');
        tree.root.left=new Node('B');
        tree.root.right=new Node('C');
        tree.root.left.left=new Node('D');
        tree.root.left.right=new Node('E');
        tree.preOrder(tree.root);
    }
    
}
