
package hsms.database;

import java.sql.*;
public class DbConnection {  

    /**
     * 
     *
     * @return
     */
    public static Connection getconnection() {
         try{
          //Get connection to database
          Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsales?zeroDateTimeBehavior=convertToNull","root","flashdisk");
          // Create a statement
        //  Statement myStatement= myConn.createStatement();
          //Execute SQL QUery
          //ResultSet myRs= myStatement.executeQuery("select* from hotelsales.user");
          //Process the result set
          //while(myRs.next()){
            //  System.out.println(myRs.getString("username")+","+ myRs.getString("password"));
             //}
           }
      catch(SQLException e){
          
        //  e.printStackTrace();
      }
        return null;
    }

    public Object myStatement(String sql_query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
