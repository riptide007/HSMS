package hsms;

import hsms.database.DbConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class RoomBookingController {
    public int roomid;
    public String roontype;
    public String guestId;
    public String guestname;
    
  
    
     @FXML
    private AnchorPane RoomBookingInterface;
     @FXML
    private TextField guestName;

    @FXML
    private DatePicker bookedFrom;

    @FXML
    private DatePicker bookedTo;
    @FXML
    private Label roomID;
    @FXML
    private TextField guestID;
    private Object stmt;
 public RoomBookingController() throws SQLException {
     
 }
      @FXML
    void cancel_roomBooking(ActionEvent event) {
    
    }

    @FXML
    void first_roomBooking(ActionEvent event) {

    }

    @FXML
    void last_roomBooking(ActionEvent event) {

    }
      @FXML
    void next_roomBooking(ActionEvent event) {

    }

    @FXML
    void previous_roomBooking(ActionEvent event) {

    }
      @FXML
    void save_roomBooking(ActionEvent event) {

    }
    @FXML
    void back_roomBooking(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Reception_MainMenu.fxml"));
      RoomBookingInterface.getChildren().setAll(pane);
    }

    @FXML
    void logout_RoomBooking(ActionEvent event) throws IOException{
AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       RoomBookingInterface.getChildren().setAll(pane);
    }
    
   
        //Connection connect = DbConnection.getconnection();
        //Statement state = connect.createStatement();
        //String strSelect = "select roomID from room";
        // System.out.println("The SQL query is: " + strSelect);  // Echo For debugging
        // ResultSet rset = state.executeQuery(strSelect);
        // while(rset.next()) {   // Move the cursor to the next row
         //   System.out.println(rset.getInt("roomID"));
         //}
   

  
    


