package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import hsms.database.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
public class LogIn_PortalController {

    @FXML
    public AnchorPane AdminlogInPane;

    @FXML
    public PasswordField password_admin;

    @FXML
    public TextField username_admin;

    @FXML
    public TextField LabelMessage;
    public Connection connect;

    @FXML
    public void AdminLogIn() throws Exception {//where is the log in button action event.
     connect = DbConnection.getconnection();
    String sql_query = "select * from hotelsales.user where username='"
            +username_admin.getText()+ "' and password='"+ password_admin.getText()+ "'";
    ResultSet myRs= connect.prepareStatement(sql_query).executeQuery(); 
   // boolean status= Statement.execute();
    if(myRs.next()){
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        AdminlogInPane.getChildren().setAll(pane);
    }
    else{
          LabelMessage.setText("Username or Password is incorrect");
    }
    } 

    @FXML
    void back_adminInterface(ActionEvent event)   throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       AdminlogInPane.getChildren().setAll(pane);
    }

    }

