package Src.DSA.LeetCode;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public boolean isLeaf() {
        return (left == null && right == null);
    }
}
