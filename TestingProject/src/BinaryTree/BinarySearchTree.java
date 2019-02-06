package BinaryTree;

public class BinarySearchTree {

    /*

    Every node has a value that is greater than or equal to the node values in the left sub-tree, and less than or equal to the node values in the right sub-tree
     */

    Node root;

    // We want to keep the tree sorted


    // If the new node's value is lower than the current node, go to the left child
    // If the new node's value is greater than the current node, go to the right child
    // When the current node is null, we've reached a leaf node and can insert the new node in that position

    public void add(int value) {
        add(root, value);
    }


    private Node add(Node current, int value) {
        if(current == null) {
            return new Node(value);
        }

        if(value < current.value) {
            current.left = add(current.left, value);
        } else if(value > current.value) {
            current.right = add(current.right, value);
        } else { // value exists
            return current;
        }

        return current;
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node current, int value) {
        if(current == null) {
            return false;
        }

        if(value == current.value) {
            return true;
        }

        if(value < current.value) {
            contains(current.left, value);
        } else {
            contains(current.right, value);
        }

        return false;
    }

}
