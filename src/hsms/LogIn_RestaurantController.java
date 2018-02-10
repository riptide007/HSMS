package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LogIn_RestaurantController {

    @FXML
    private AnchorPane RestaurantLogInPane;
     @FXML
    private PasswordField passwordRestaurant;

    @FXML
    private TextField username_Restaurant;

    @FXML
    private TextField LabelMessage_Restaurant;
    
    
    @FXML
    void RestaurantInterface(ActionEvent event) throws IOException {
        if( username_Restaurant.getText().equals("Restaurant") && passwordRestaurant.getText().equals("FoodLove")){
         AnchorPane pane = FXMLLoader.load(getClass().getResource("Restaurant.fxml"));
       RestaurantLogInPane.getChildren().setAll(pane);
    }{
       LabelMessage_Restaurant.setText("Username or Password is incorrect");

}
}
    @FXML
    void back_RestauranttInterface(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       RestaurantLogInPane.getChildren().setAll(pane);
    }
}
