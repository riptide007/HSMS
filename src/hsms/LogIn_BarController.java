package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.sql.*;
import javax.swing.*;


public class LogIn_BarController {
       @FXML
    private AnchorPane BarLogInPane;

    @FXML
    private PasswordField password_bar;

    @FXML
    private TextField username_bar;

    @FXML
    private TextField LabelMessage_bar;

    @FXML
    void BarInterface(ActionEvent event) throws IOException, SQLException {
         if( username_bar.getText().equals("Bar") && password_bar.getText().equals("Bartender")){
         AnchorPane pane = FXMLLoader.load(getClass().getResource("Bar.fxml"));
       BarLogInPane.getChildren().setAll(pane);
    }
         else{
      LabelMessage_bar.setText("Username or Password is incorrect");

    }
}
    
    @FXML
    void backBarInterface(ActionEvent event)throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
      BarLogInPane.getChildren().setAll(pane);
    }

    
}


    