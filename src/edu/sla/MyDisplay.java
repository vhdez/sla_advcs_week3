package edu.sla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyDisplay extends Application {
    private static MyStuff myStuff;
    private static Label hilabel;
    private static Label descriptionlabel;

    private static void nextButton_click() {
        // Get next item from my stuff
        Displayable next = myStuff.next();
        // Update labels with this next item's greeting and description
        hilabel.setText("GREETING:\n" + next.hiMessage());
        descriptionlabel.setText("DESCRIPTION:\n" + next.description());
    }

    //@Override
    public void start(Stage primaryStage) throws Exception {
        myStuff = new MyStuff();

        // Create button that displays next item's info when clicked
        Button nextButton = new Button("Next!!!!!!");
        nextButton.setOnAction(e -> nextButton_click());

        // Create 2 labels for display greeting then description
        hilabel = new Label();
        descriptionlabel = new Label();

        // Display the button and 2 labels vertically
        VBox myVBox = new VBox(nextButton, hilabel, descriptionlabel);
        Scene scene = new Scene(myVBox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Display my stuff!!!!");
        primaryStage.show();

    }
}
