package com.company;

import java.sql.*;
import java.util.Scanner;

public class DeleteBook {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    public void deletebookOperation()
    {
        try
        {
            connect = ApiClient.getInstance();

            System.out.print("\nEnter Book ID to remove from the list: ");
            Scanner scdi = new Scanner(System.in);
            int dbi = scdi.nextInt();
            System.out.println("\n");

            connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
            String query = "DELETE FROM book_list where UserID = ?";
            PreparedStatement preparedstatement = connect.prepareStatement(query);
            preparedstatement.setInt(1, dbi);

            preparedstatement.execute();
            connect.close();

        }

        catch (SQLException | ClassNotFoundException ex)
        {
            System.out.println("My Error "+ex);
        }
    }
}
