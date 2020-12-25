package com.company;

import java.sql.*;

public class UserList {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    public void userlistOperation()
    {
        try
        {
            connect = ApiClient.getInstance();

            connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
            String query = "SELECT * FROM user_list";

            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next())
            {
                System.out.println("User ID: "+result.getString("UserID"));
                System.out.println("User Name: "+result.getString("UserName"));
                System.out.println("Contact Number: "+result.getString("ContactNumber"));
                System.out.println("E-mail: "+result.getString("Email"));
            }
            statement.close();

        }

        catch(SQLException | ClassNotFoundException ex)
        {
            System.out.println("My Error "+ex);
        }
    }
}
