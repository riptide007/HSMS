package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import hsms.database.DbConnection;
import java.sql.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;;

public class LogIn_PortalController {

    @FXML
    public AnchorPane AdminlogInPane;
     @FXML
    void back_adminInterface(ActionEvent event)   throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       AdminlogInPane.getChildren().setAll(pane);
    }

    @FXML
    public PasswordField password_admin;
    Stage dialogStage = new Stage();
    Scene scene;
 
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @FXML
    public TextField username_admin;

    @FXML
    public TextField LabelMessage;
<<<<<<< HEAD
    public Connection connect;

    @FXML
    public void AdminLogIn() throws Exception {//where is the log in button action event.
     connect = DbConnection.getconnection();
    String sql_query = "select * from hotelsales.user where username='"
            +username_admin.getText()+ "' and password='"+ password_admin.getText()+ "'";
    ResultSet myRs= connect.prepareStatement(sql_query).executeQuery(); 
   // boolean status= Statement.execute();
    if(myRs.next()){
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        AdminlogInPane.getChildren().setAll(pane);
    }
    else{
          LabelMessage.setText("Username or Password is incorrect");
    }
    } 
=======
>>>>>>> pr/4

    @FXML
    public void AdminLogIn(ActionEvent event) throws IOException, SQLException {
     Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
       String username = username_admin.getText().toString();
String password = password_admin.getText().toString();
 
String sql = "SELECT * FROM user WHERE username = ? and password = ?";
try{
preparedStatement = myConn.prepareStatement(sql);
preparedStatement.setString(1, username);
preparedStatement.setString(2, password);
resultSet = preparedStatement.executeQuery();
if(!resultSet.next()){
infoBox("Enter Correct Username and Password", "Failed", null);
}else{
infoBox("Login Successfull", "Success", null);
Node source = (Node) event.getSource();
dialogStage = (Stage) source.getScene().getWindow();
dialogStage.close();
scene = new Scene(FXMLLoader.load(getClass().getResource("MainMenu.fxml")));
dialogStage.setScene(scene);
dialogStage.show();
}
 
}catch(Exception e){
e.printStackTrace();
}
}
public static void infoBox(String infoMessage, String titleBar, String headerMessage)
{
Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle(titleBar);
alert.setHeaderText(headerMessage);
alert.setContentText(infoMessage);
alert.showAndWait();
}
 

}
    

