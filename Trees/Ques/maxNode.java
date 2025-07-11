package Trees.Ques;

class Node3 {
    int data;
    Node3 left, right;

    Node3(int data) {
        this.data = data;
    }
}

class TreeTraverse3 {
    Node3 root;

    int max(Node3 root) {
        if (root == null) {
            return Integer.MIN_VALUE;  // base case
        }

        int lmax = max(root.left);     // max in left subtree
        int rmax = max(root.right);    // max in right subtree

        // return max of left, right, and current node
        return Math.max(root.data, Math.max(lmax, rmax));
    }
}

public class maxNode {
    public static void main(String[] args) {
        TreeTraverse3 tree3 = new TreeTraverse3();
        tree3.root = new Node3(2);
        tree3.root.left = new Node3(5);
        tree3.root.right = new Node3(8);
        tree3.root.left.left = new Node3(3);
        tree3.root.left.right = new Node3(9);

        int maxValue = tree3.max(tree3.root);
        System.out.println("Maximum value in the tree: " + maxValue);
    }
}
