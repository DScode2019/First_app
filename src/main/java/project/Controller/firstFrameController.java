package project.Controller;

import com.sun.xml.internal.fastinfoset.tools.FI_SAX_XML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import project.View.First_frame;

import java.io.IOException;

public class firstFrameController {


    @FXML
    private BorderPane rootLayout;
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private void second_frame() throws IOException {
        LoadFrame("Second_Frame");
    }

    @FXML
    private void first_frame() throws IOException {
        LoadFrame("First_App");
    }


    @FXML
    private void addRecord() throws IOException {
        PopUpFrame("AddRecord");
    }



    public void PopUpFrame(String page) throws IOException {


        Parent root=null;
        FXMLLoader loader =new FXMLLoader();
        String pageFxl="/View/"+page+".fxml";

        root=loader.load(First_frame.class.getResourceAsStream(pageFxl));
        Stage dialoStage=new Stage();
        dialoStage.setResizable(false);
        Scene scene=new Scene(root);
        dialoStage.setScene(scene);
        dialoStage.show();
    }

    public FXMLLoader LoadFrame(String page) throws IOException {


        Parent root=null;
        FXMLLoader loader =new FXMLLoader();
        String pageFxl="/View/"+page+".fxml";

       root=loader.load(First_frame.class.getResourceAsStream(pageFxl));
       rootLayout.setCenter(root);
       return loader;
    }
}
