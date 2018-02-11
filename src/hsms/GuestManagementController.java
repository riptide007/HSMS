package hsms;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class GuestManagementController {

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
    int saveGuestManagement(ActionEvent event) {
         ResultSet rs = null;
        int guestId = 0;

       String sql= "insert into guest(Fname,phonenumber,email,address, town,city,numofpeople,numofrooms,numofnights) values(?,?,?,?,?,?,?,?,?) "; 
 try(Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
       PreparedStatement pst = myConn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
          
           pst.setString(1, fullName.getText());
           pst.setString(2, phoneNumber.getText());
           pst.setString(3, email.getText());
           pst.setString(4, address.getText());
           pst.setString(5, town.getText());
           pst.setString(6, city.getText());
           pst.setString(7, numberOfPeople.getText());
           pst.setString(8, NumberOfRooms.getText());
           pst.setString(9,numberOfNights.getText());
           
          int rowAffected = pst.executeUpdate();
            if(rowAffected == 1)
            {
                // get guest id
                rs = pst.getGeneratedKeys();
                if(rs.next())
                    guestId = rs.getInt(1);
 
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
                 JOptionPane.showMessageDialog(null,"Saved");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        
        return guestId ;
    }               
           
    
    
    @FXML
    void roomBooking(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("RoomBooking.fxml"));
      guestManagementPane.getChildren().setAll(pane);
    }
     @FXML
    void deleteGuestManagement(ActionEvent event) throws SQLException, SQLException {
  ResultSet rs = null;


       String sql= "insert into guest(Fname,phonenumber,email,address, town,city,numofpeople,numofrooms,numofnights) values(?,?,?,?,?,?,?,?,?) "; 
 try(Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
       PreparedStatement pst = myConn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
        
           
            
          fullName.setText("");
          phoneNumber.setText("");
          email.setText("");
          address.setText("");
          town.setText("");
          city.setText("");
          numberOfPeople.setText("");
          NumberOfRooms.setText("");
          numberOfNights.setText("");
          
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        }
    }
    
   

