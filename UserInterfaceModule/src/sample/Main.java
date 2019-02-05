package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("JavaFX Welcome");

        primaryStage.show();

        GridPane grid = new GridPane();
        // Changes the default position of the grid from top left of the scene to the center
        grid.setAlignment(Pos.CENTER);
        // Manage the spacing between rows and columns
        grid.setHgap(10);
        grid.setVgap(10);
        // Manages the space around the edges of the grid pane
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");

        // can replace this with a style sheet
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        // Add to column 0, row 0. Set the column span to 2 and the row span to 1
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Search:");

        // Add a label to column 0, row 1
        grid.add(userName, 0, 1);

        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "First Name",
                                "Last Name",
                                "E-mail",
                                "Company",
                                "Job Title",
                                "University"
                );

        final ComboBox searchFilter = new ComboBox(options);

        grid.add(searchFilter, 2, 1);


        TextField userTextField = new TextField();
        // Add a text field to the grid pane at column 1, row 1
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        Button searchBtn = new Button("Search");
        Button clearBtn = new Button("Clear");

        //Create an HBox layout with spacing of 10 pixels.  The HBox pane sets an alignment for the button that is different from the alignment applied to the other controls in the grid pane
        HBox hbBtn = new HBox(10);

        // Position a node at the bottom of the space vertically and at the right edge of the space horizontally
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);

        // Add button as a child of HBox pane
        hbBtn.getChildren().addAll(searchBtn, clearBtn);
        // Add the HBox pane to the grid in column 1, row 4
        grid.add(hbBtn, 1, 4);


        //grid.setGridLinesVisible(true);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        searchBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });

///////////////

        TableView table = new TableView();

        final Label label = new Label("Search Results");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");

        table.getColumns().addAll(firstNameCol, lastNameCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        grid.add(vbox, 1, 5);

        Button clearTableBtn = new Button("Clear Table");
        HBox hbBtn2 = new HBox(10);

        hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn2.getChildren().addAll(clearTableBtn);

        grid.add(hbBtn2, 1, 6);




        ///////////////


        // clear results button

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
