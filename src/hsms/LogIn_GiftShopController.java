package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LogIn_GiftShopController {

    @FXML
    private AnchorPane GiftShopLogInPane;

    @FXML
    private PasswordField password_giftshop;

    @FXML
    private TextField username_giftshop;

    @FXML
    private TextField LabelMessage_bar;

    @FXML
    void GiftShopInterface(ActionEvent event) throws IOException {
        if( username_giftshop.getText().equals("GiftShop") && password_giftshop.getText().equals("34003")){
      AnchorPane pane = FXMLLoader.load(getClass().getResource("Gift_Shop.fxml"));
       GiftShopLogInPane.getChildren().setAll(pane);

    }
        LabelMessage_bar.setText("Username or Password is incorrect");

}
      @FXML
    void back_giftshopInterface(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       GiftShopLogInPane.getChildren().setAll(pane);
    }

}
