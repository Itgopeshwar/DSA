package Src.DSA.LeetCode;

public class CheckNodesLeafNodes {
    public static void main(String[] args) {
        // Constructing a simple binary tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Check if nodes are leaf nodes:
        System.out.println("Is node with value 1 a leaf node? " + root.isLeaf());  // false
        System.out.println("Is node with value 4 a leaf node? " + root.left.left.isLeaf());  // true
        System.out.println("Is node with value 5 a leaf node? " + root.left.right.isLeaf());  // true
    }
}
