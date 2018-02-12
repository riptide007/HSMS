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
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;;


public class LogIn_RestaurantController {

    @FXML
    private AnchorPane RestaurantLogInPane;
     @FXML
    private PasswordField passwordRestaurant;
     Stage dialogStage = new Stage();
    Scene scene;
 
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @FXML
    private TextField username_Restaurant;

    @FXML
    private TextField LabelMessage_Restaurant;
    
    @FXML
    void back_RestauranttInterface(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       RestaurantLogInPane.getChildren().setAll(pane);
    }
    
    
    @FXML
    void RestaurantInterface(ActionEvent event) throws IOException, SQLException {
       Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
       String username = username_Restaurant.getText().toString();
       String password = passwordRestaurant.getText().toString();
 
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
scene = new Scene(FXMLLoader.load(getClass().getResource("Restaurant.fxml")));
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
    

