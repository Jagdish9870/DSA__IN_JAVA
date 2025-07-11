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

    // Method to calculate sum of all nodes
    int sumOfNodes(Node root) {
        if (root == null)
            return 0;

        // Recursively sum left + right + root
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
}

public class TreeSum {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Build the tree
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        int totalSum = tree.sumOfNodes(tree.root);
        System.out.println("Sum of all nodes in the tree: " + totalSum);
    }
}
