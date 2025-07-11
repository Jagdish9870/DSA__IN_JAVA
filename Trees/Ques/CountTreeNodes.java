package Trees.Ques;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Recursive method to count all nodes in the tree
    int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        // Count current node + left subtree + right subtree
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}

public class CountTreeNodes {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Build the tree
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        int totalNodes = tree.countNodes(tree.root);
        System.out.println("Total number of nodes: " + totalNodes);
    }
}
