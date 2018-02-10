package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class ReportsController {

    @FXML
    private AnchorPane reportsPane;

    @FXML
    void Back_Reports(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
       reportsPane.getChildren().setAll(pane);
    }

    @FXML
    void LogOut(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        reportsPane.getChildren().setAll(pane);
    }
    @FXML
    void EXCEL2015(ActionEvent event) {

    }

    @FXML
    void EXCEL2016(ActionEvent event) {

    }

    @FXML
    void EXCEL2017(ActionEvent event) {

    }

    @FXML
    void EXCEL2018(ActionEvent event) {

    }

    @FXML
    void PDF2015(ActionEvent event) {

    }

    @FXML
    void PDF2016(ActionEvent event) {

    }

    @FXML
    void PDF2017(ActionEvent event) {

    }

    @FXML
    void PDF2018(ActionEvent event) {

    }

}
