package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class MainMenuController {

    @FXML
    private AnchorPane MainMenuPane;

    @FXML
    void Logout_MainMenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        MainMenuPane.getChildren().setAll(pane);
    }

    @FXML
    void bar_mainmenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Bar.fxml"));
        MainMenuPane.getChildren().setAll(pane);
    }

    @FXML
    void giftShop_mainmenu(ActionEvent event)throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Gift_Shop.fxml"));
        MainMenuPane.getChildren().setAll(pane);
    }


    @FXML
    void reception_mainmenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Reception_MainMenu.fxml"));
        MainMenuPane.getChildren().setAll(pane);
    }

    @FXML
    void reports_mainmenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Reports.fxml"));
        MainMenuPane.getChildren().setAll(pane);
    }

    @FXML
    void restaurant_mainmenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Restaurant.fxml"));
        MainMenuPane.getChildren().setAll(pane);
    }

}
