/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hsms;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Deepali
 */
public class LogInController implements Initializable {
    
    private Label label;
    @FXML
    private AnchorPane logInPane;
    
    private void handleButtonAction(ActionEvent event) {
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logIn_Bar(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn_Bar.fxml"));
        logInPane.getChildren().setAll(pane);
    }
      

    @FXML
    void logIn_GiftShop(ActionEvent event) throws IOException {
AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn_GiftShop.fxml"));
        logInPane.getChildren().setAll(pane);
    }

    @FXML
    void logIn_Portal(ActionEvent event)throws IOException {
AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn_Portal.fxml"));
        logInPane.getChildren().setAll(pane);
    }

    @FXML
    void logIn_Receptionist(ActionEvent event)throws IOException {
AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn_Receptionist.fxml"));
        logInPane.getChildren().setAll(pane);
    }
@FXML
    void logIn_Reports(ActionEvent event)throws IOException {
AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn_Reports.fxml"));
        logInPane.getChildren().setAll(pane);
    }

    @FXML
        void logIn_Restaurant(ActionEvent event)throws IOException {
    AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn_Restaurant.fxml"));
            logInPane.getChildren().setAll(pane);
        }
}
