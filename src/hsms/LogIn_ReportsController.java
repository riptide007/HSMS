package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LogIn_ReportsController {

    @FXML
    private AnchorPane ManagerLogInPane;
    @FXML
    private PasswordField password_Reports;

    @FXML
    private TextField username_Reports;

    @FXML
    private TextField LabelMessage_Reports;

    @FXML
    void AdminLogIn(ActionEvent event) {

    }

    @FXML
    void ReportsLogin(ActionEvent event) throws IOException {
        if( username_Reports.getText().equals("Manager") && password_Reports.getText().equals("Reports")){
      AnchorPane pane = FXMLLoader.load(getClass().getResource("Reports.fxml"));
       ManagerLogInPane.getChildren().setAll(pane);

    }
        LabelMessage_Reports.setText("Username or Password is incorrect");

}
    @FXML
    void back_ReportstInterface(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       ManagerLogInPane.getChildren().setAll(pane);
    }
}
