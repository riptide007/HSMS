package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class RoomManagementController {
    @FXML
    private TextField roomID;

    @FXML
    private TextField roomNum;

    @FXML
    private TextField roomType;

    @FXML
    private TextField roomRate;

    @FXML
    private TextField bedType;


    @FXML
    private AnchorPane RoomManagementPane;

    @FXML
    void Back_RoomManagement(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Reception_MainMenu.fxml"));
      RoomManagementPane.getChildren().setAll(pane);
    }

    @FXML
    void Logout_RoomManagent(ActionEvent event) {

    }

    @FXML
    void save_RoomManagement(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
     RoomManagementPane.getChildren().setAll(pane);
    }
        
    @FXML
    void delete_room(ActionEvent event) {

    }

    @FXML
    void firstRoom(ActionEvent event) {

    }

    @FXML
    void last_room(ActionEvent event) {

    }

    @FXML
    void new_room(ActionEvent event) {

    }

    @FXML
    void next_room(ActionEvent event) {

    }

    @FXML
    void previous_room(ActionEvent event) {

    }


}
