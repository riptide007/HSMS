package hsms;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.ZoneId;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;


public class RoomBookingController {
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
     @FXML
    private TextField roomType;
    

    @FXML
     int cancel_roomBooking(ActionEvent event)throws SQLException, SQLException {
  ResultSet rs = null;
  int roomId = 0;


       String sql= "insert into room(timeIN,timeOUT,roomType) values(?,?,?)"
               + "insert into guest(Fname) values(?)";
               
 try(Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
       PreparedStatement pst = myConn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
          
     java.util.Date date = 
    java.util.Date.from(bookedFrom.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
java.sql.Date sqlDate = new java.sql.Date(date.getTime());
pst.setDate(1, sqlDate);

java.util.Date.from(bookedTo.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
pst.setDate(2, sqlDate);
        
pst.setString(3, roomType.getText());
pst.setString(1, guestName.getText());




         
        int rowAffected = pst.executeUpdate();
            if(rowAffected == 1)
            {
                // get roomId 
                rs = pst.getGeneratedKeys();
                if(rs.next())
                    roomId  = rs.getInt(1);
 
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
        
        return roomId  ;
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
     int save_roomBooking(ActionEvent event) {
        ResultSet rs = null;
        int roomId = 0;
        

     String sql= "insert into room(timeIN,timeOUT,roomType) values(?,?,?,?)";
 try(Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
       PreparedStatement pst = myConn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
          
         
        pst.executeUpdate();
          int rowAffected = pst.executeUpdate();
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pst.getGeneratedKeys();
                if(rs.next())
                    roomId = rs.getInt(1);
 
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
        
        return roomId;
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
  public static void main (String[]args){
        try{
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
        Statement myStatement= myConn.createStatement();
        
           String sql= "insert into room"
                   + "(roomID,roomType, guestID, timeIN, timeOut}";
           myStatement.executeUpdate(sql);
        
         
    }catch(Exception e){
          
          e.printStackTrace();
      }
        

}
}
