package project.View;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;


public class First_frame extends Application {


    private BorderPane borderLayout;
    Stage firstStage;

    public void start(Stage primaryStage) throws Exception {
        firstStage= new Stage();
        firstStage.setTitle("My First Application");
        initLayout();

    }



    public void initLayout() throws IOException {


        String fxmlFile="/View/HomeApp.fxml";
        FXMLLoader loader=new FXMLLoader();
        borderLayout=loader.load(First_frame.class.getResourceAsStream(fxmlFile));


        Scene scene = new Scene(borderLayout);
        firstStage.setScene(scene);
        firstStage.show();

    }
}
