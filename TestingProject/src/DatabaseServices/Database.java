package DatabaseServices;

import BinaryTree.BinarySearchTree;
import BinaryTree.Node;
import Models.PersonRecord;

import java.util.ArrayList;

public class Database {

    //private ArrayList<PersonRecord> data;
    private BinarySearchTree dataTree;

    public Database() {
        dataTree = new BinarySearchTree();

        //add records to tree
    }

    public ArrayList<PersonRecord> getAllRecords() {
        CSVReader reader = new CSVReader();
        return reader.getAllDataFromCSVFile();

    }

    public PersonRecord getPersonByLastName(String lastName) {
        PersonRecord  personToReturn = dataTree.getPersonRecordByLastName(lastName);

        return personToReturn;

    }

    public void fillBinaryTreeWithAllRecords(ArrayList<PersonRecord> records) {

        for(PersonRecord r : records) {
            dataTree.add(r);
        }

    }

}
