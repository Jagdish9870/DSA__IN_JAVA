package Trees.BST;
class Node{
    Node left, right;
    char key;
    Node(char key){
        this.key = key;
    }
}
class BsImplementation{
    Node root;
    void insertKey(char key){
        root=insertIntoBST(root, key);
    }
    Node insertIntoBST(Node root, char key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key){
            root.left=insertIntoBST(root.left, key);
        } else if(key>root.key){
            root.right=insertIntoBST(root.right, key);
        } else {
            // Duplicate keys are not allowed in BST
            return root;
        }
        return root;

    }
    void inOrderTraversal(Node root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.key+" ");
            inOrderTraversal(root.right);
        }
    }
}

public class BinaryST {
    public static void main(String[] args) {
        BsImplementation bst = new BsImplementation();
        bst.insertKey('F');
        bst.insertKey('B');
        bst.insertKey('G');
        bst.insertKey('A');
        bst.insertKey('D');
        bst.insertKey('C');
        bst.insertKey('E');
        bst.insertKey('I');
        bst.insertKey('H');

        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal(bst.root);
        
    }
    
}
