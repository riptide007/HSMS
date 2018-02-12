
package hsms.database;

import java.sql.*;
import hsms.database.*;
public class Insert_Delete {
    public static void main(String[] args) {
        
      try (
         
         Connection conn = DbConnection.getconnection();
         Statement stmt = conn.createStatement();
      ) {
         
 
         // DELETE records w
         String deleteID = "delete from guest where guestID = ? "; 
         int countDeleted = stmt.executeUpdate(deleteID);
         PreparedStatement delete = conn.prepareStatement(deleteID);
         
         delete.setString(1,"guestID");
      
         
         
         
         
     
 
         // INSERT a record
         String sqlInsert = "insert into guest " // need a space
               + "values (5, 'Komal', 'Bhatt', 5.00)";
         System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
         int countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " records inserted.\n");
 
         // INSERT multiple records
         sqlInsert = "insert into guest values "
               + " (6, 'Abby', 'Apollo', 20.00),"
               + "(7, 'pooja', 'doshi', 100.00),"
               + "(8, 'vipul', 'Bhatt', 0.00)";
         System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
         countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " records inserted.\n");
 
         // INSERT a partial record
         sqlInsert = "insert into guest (guestID, Fname, Lname, Payementdetails) "
               + "values (9, 'Raj', 'Soni', 0.00)";
         System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
         countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " records inserted.\n");
 
         // Issue a SELECT to check the changes
         String strSelect = "select * from guest";
         System.out.println("The SQL query is: " + strSelect);  // Echo For debugging
         ResultSet rset = stmt.executeQuery(strSelect);
         while(rset.next()) {   // Move the cursor to the next row
            System.out.println(rset.getInt("guestID") + ", "
                    + rset.getString("Fname") + ", "
                    + rset.getString("Lname") + ", "
                    + rset.getInt("Payementdetails"));
         }
      } catch(SQLException ex) {
       //  ex.printStackTrace();
      }
      // Step 5: Close the resources - Done automatically by try-with-resources
   }
}

