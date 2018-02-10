package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Reception_MainMenuController {
    @FXML
    private AnchorPane ReceptionistPane;

      @FXML
    void Logout_ReceptionMainMenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        ReceptionistPane.getChildren().setAll(pane);
    }

    @FXML
    void RoomBooking(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("RoomBooking.fxml"));
        ReceptionistPane.getChildren().setAll(pane);
    }

    @FXML
    void availability(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Availability.fxml"));
        ReceptionistPane.getChildren().setAll(pane);
    }

    @FXML
    void guestManagement(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("GuestManagement.fxml"));
        ReceptionistPane.getChildren().setAll(pane);
    }

    @FXML
    void roomManagement(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("RoomManagement.fxml"));
        ReceptionistPane.getChildren().setAll(pane);
    }
    @FXML
    protected void Reception_MainMenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        ReceptionistPane.getChildren().setAll(pane);
    }

}
