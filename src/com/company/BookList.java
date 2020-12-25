package com.company;

import java.sql.*;

public class BookList {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    public void booklistOperation()
    {
        try
        {
            connect = ApiClient.getInstance();

            connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
            String query = "SELECT * FROM book_list";

            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next())
            {
                System.out.println("Book ID: "+result.getString("BookID"));
                System.out.println("Book Name: "+result.getString("BookName"));
                System.out.println("Book Author: "+result.getString("Author"));
                System.out.println("Fee: "+result.getString("Fee"));
            }
            statement.close();

        }

        catch(SQLException | ClassNotFoundException ex)
        {
            System.out.println("My Error "+ex);
        }
    }
}
