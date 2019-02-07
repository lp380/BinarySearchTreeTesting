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

    public void add(PersonRecord value) {
        add(root, value);
    }


    private Node add(Node current, PersonRecord person) {

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

    public Node  getPersonNodeByLastName(Node root, String lastName) {
        if(root == null) {
            return root;
        }

        if(root.value.getLastname().equals(lastName)) {
            return root;
        }

        if(root.value.getLastname().compareTo(lastName) < 0) { // val is greater than the root's last name value
            return getPersonNodeByLastName(root.right, lastName);
        } else { // less than the roots value
            return getPersonNodeByLastName(root.right, lastName);
        }
    }

// get all nodes

    public boolean contains(PersonRecord value) {
        return contains(root, value);
    }

    private boolean contains(Node current, PersonRecord personToFind) {
        if(current == null) {
            return false;
        }

        if(personToFind.getLastname().equals(current.value.getLastname())) {
            return true;
        }

        if(personToFind.getLastname().compareTo(current.value.getLastname()) < 0) { // current nodes value is less than the key we are looking for
            contains(current.left, personToFind);
        } else {
            contains(current.right, personToFind);
        }

        return false;
    }

}
