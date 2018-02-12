package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.sql.*;  
import javax.swing.JOptionPane;

public class RoomManagementController {
  String RoomNumber;
  String RoomType;
  String RoomRate;
  String BedType;
          
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

    public RoomManagementController() {
        this.RoomNumber = roomNum.getText();
        this.RoomType = roomType.getText();
        this.RoomRate= roomRate.getText();
        this.BedType= bedType.getText();
    }
        

    @FXML
    void Back_RoomManagement(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Reception_MainMenu.fxml"));
      RoomManagementPane.getChildren().setAll(pane);
    }

    @FXML
    void Logout_RoomManagent(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
     RoomManagementPane.getChildren().setAll(pane);

    }

    @FXML
             
    void save_RoomManagement(ActionEvent event) throws SQLException {
         try{
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
        PreparedStatement pst = null;

        
           String sql= "insert into room(roomNumber,price per night,roomType,bedType} values(?,?,?,?)";
          
           
           pst.setString(1,RoomNumber);
           pst.setString(2,RoomRate);
           pst.setString(3,RoomType);
           pst.setString(4,BedType);
           
           pst=myConn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null,"Saved");
                   
           
    }catch(Exception e){
          
          e.printStackTrace();
      }
    }       
        
    @FXML
    void delete_room(ActionEvent event) throws SQLException {
         try{
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
        PreparedStatement pst = null;

        
           String sql= "insert into room(roomNumber,price per night,roomType,bedType} values(?,?,?,?)";
          
             roomNum.setText("");
             roomRate.setText("");
             roomType.setText("");
             bedType.setText("");
           
           pst=myConn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null,"Saved");
                   
           
    }catch(Exception e){
          
          e.printStackTrace();
      }
    } 

    @FXML
    void firstRoom(ActionEvent event) {

    }

    @FXML
    void last_room(ActionEvent event) {

    }

    @FXML
    void new_room(ActionEvent event) throws SQLException {
         try{
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
        PreparedStatement pst = null;

        
           String sql= "insert into room(roomNumber,price per night,roomType,bedType} values(?,?,?,?)";
          
             roomNum.setText("");
             roomRate.setText("");
             roomType.setText("");
             bedType.setText("");
           
           pst=myConn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null,"Saved");
                   
           
    }catch(Exception e){
          
          e.printStackTrace();
      }
    } 

    @FXML
    void next_room(ActionEvent event) {

    }

    @FXML
    void previous_room(ActionEvent event) {

    }

    public static void main (String[]args){
        
        
        

}
}

