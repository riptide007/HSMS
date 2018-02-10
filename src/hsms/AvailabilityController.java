package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;


public class AvailabilityController {
 @FXML
    private AnchorPane availabilityPane;
    @FXML
    void backAvailability(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Reception_MainMenu.fxml"));
      availabilityPane.getChildren().setAll(pane);
    }

    @FXML
    private DatePicker bookingFrom;

    @FXML
    private DatePicker depatureDate;

    @FXML
    private DatePicker arrivalDate;
   

    @FXML
    void checkRoom(ActionEvent event) {

    }

    @FXML
    void logOutAvailability(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
      availabilityPane.getChildren().setAll(pane);
    }

}
