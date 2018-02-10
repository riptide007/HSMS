package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LogIn_ReceptionistController {

    @FXML
    private AnchorPane ReceptionsPane;

    @FXML
    private PasswordField reception_password;

    @FXML
    private TextField reception_username;

    @FXML
    private TextField LabelMessage_Reception;

    @FXML
    void ReceptionLogin(ActionEvent event) throws IOException {
     if( reception_username.getText().equals("Reception") && reception_password.getText().equals("Receptionist")){
     AnchorPane pane = FXMLLoader.load(getClass().getResource("Reception_MainMenu.fxml"));
        ReceptionsPane.getChildren().setAll(pane);
    }else{
       LabelMessage_Reception.setText("Username or Password is incorrect");
      
       
       }

    }
     @FXML
    void back_ReceptionistInterface(ActionEvent event)  throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       ReceptionsPane.getChildren().setAll(pane);
    }

}
