package DatabaseServices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "MOCK_DATA.csv";
        BufferedReader reader = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            reader = new BufferedReader(new FileReader(csvFile));
            while ((line = reader.readLine()) != null) {

                // use comma as seperator
                String[] person = line.split(cvsSplitBy);

                String id = person[0];
                String firstName = person[1];
                String lastName = person[2];
                String email = person[3];
                String company = person[4];
                String jobTitle = person[5];
                String university = person[6];


                System.out.println(id + " " + firstName + " " + lastName + " " + email + " " + company + " " + jobTitle + " " + university);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
