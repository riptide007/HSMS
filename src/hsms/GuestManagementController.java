package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class GuestManagementController {
    public String firstname;
    public String lastname;
    public String city;
    public String town;
    public String numofRooms;
    public String address;
    public String phione;
    public String numofPeople;
      

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField email;

    @FXML
    private TextField address;

    @FXML
    private TextField town;

    @FXML
    private TextField numberOfPeople;

    @FXML
    private TextField NumberOfRooms;

    @FXML
    private TextField numberOfNights;

    @FXML
    private TextField city;

   @FXML
    private Label guestID;

    @FXML
    private TextField fullName;

    @FXML
    private DatePicker arrivalDate;
    @FXML
    private AnchorPane guestManagementPane;

    @FXML
    void Back_guestManagement(ActionEvent event)throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Reception_MainMenu.fxml"));
      guestManagementPane.getChildren().setAll(pane);
    }

    @FXML
    void LogOut_guestManagement(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
      guestManagementPane.getChildren().setAll(pane);
    }

    @FXML
    void saveGuestManagement(ActionEvent event) {

    }
    
    @FXML
    void roomBooking(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("RoomBooking.fxml"));
      guestManagementPane.getChildren().setAll(pane);
    }
}
