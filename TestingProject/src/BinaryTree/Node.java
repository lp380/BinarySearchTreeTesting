package BinaryTree;

import Models.PersonRecord;

public class Node {

    private int size; // number of nodes in the tree rooted at this node

    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public int getSize() {
        return this.size;
    }

}
