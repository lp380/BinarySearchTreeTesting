package BinaryTree;

import Models.PersonRecord;

public class BinarySearchTree {

    /*

    Every node has a value that is greater than or equal to the node values in the left sub-tree, and less than or equal to the node values in the right sub-tree
     */

    Node root;

    // store people by last name

    public BinarySearchTree() {

    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if(x == null) {
            return 0;
        } else {
            return x.getSize();
        }
    }

    // We want to keep the tree sorted


    // If the new node's value is lower than the current node, go to the left child
    // If the new node's value is greater than the current node, go to the right child
    // When the current node is null, we've reached a leaf node and can insert the new node in that position

    public void add(int value) {
        add(root, value);
    }


    private Node add(Node current, PersonRecord person) {

        "a".compareTo("b"); // returns a negative number, here -1
        "a".compareTo("a"); // returns  0
        "b".compareTo("a"); // returns a positive number, here 1
        "b".compareTo(null); // throws java.lang.Nul


        if(current == null) {
            return new Node(person);
        }

        if(person.getLastname().compareTo(current.value.getLastname()) < 0)  {
            current.left = add(current.left, person);
        } else if(person.getLastname().compareTo(current.value.getLastname()) > 1) {
            current.right = add(current.right, person);
        } else { // last name already exists ??
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
