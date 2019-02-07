package DatabaseServices;

import BinaryTree.BinarySearchTree;
import BinaryTree.Node;
import Models.PersonRecord;

import java.util.ArrayList;

public class Database {

    //private ArrayList<PersonRecord> data;
    private BinarySearchTree data;

    public Database() {
        data = new BinarySearchTree();

        //add records to tree
    }

    public ArrayList<PersonRecord> getAllRecords() {

    }

    public PersonRecord getPersonByLastName(String lastName) {
    }

}
