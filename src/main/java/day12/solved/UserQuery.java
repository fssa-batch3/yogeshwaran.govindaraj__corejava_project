package day12.solved;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import day11.solved.ConnectionUtil;


public class UserQuery {
 
    public static void main(String[] args) throws Exception {       
         
        
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);
         
        Statement stmt = connection.createStatement();
         
        // Step 03: Execute Insert Query
        String query ="INSERT INTO user (username, email, password) VALUES (\"ishu\",\"ishuuu@ctr.freshworks.com\", \"vaadi\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );
         
        //Step 04: Execute SELECT Query
        final String selectQuery = "SELECT username,email FROM user";
         
        //Step 05: Get the resultset
        ResultSet rs = stmt.executeQuery(selectQuery);
         
        //Step 06: Iterate the result
        while ( rs.next()) {
        	           
        	String userName = rs.getString("username");
            String email = rs.getString("email");
             
            System.out.println("UserName:" + userName + ", EMAIL ID:" + email);
        }
         
        //Step 07: close the connection resources       
        rs.close();
        stmt.close();
        connection.close();
         
         
         
    }
     
}