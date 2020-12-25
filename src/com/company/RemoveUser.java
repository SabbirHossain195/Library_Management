package com.company;

import java.sql.*;
import java.util.Scanner;

public class RemoveUser {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    public void removeuserOperation()
    {
        try
        {
            connect = ApiClient.getInstance();

            System.out.print("\nEnter User ID to remove from the list: ");
            Scanner scri = new Scanner(System.in);
            int rui = scri.nextInt();
            System.out.println("\n");

            connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
            String query = "DELETE FROM user_list where UserID = ?";
            PreparedStatement preparedstatement = connect.prepareStatement(query);
            preparedstatement.setInt(1, rui);

            preparedstatement.execute();
            connect.close();

        }

        catch (SQLException | ClassNotFoundException ex)
        {
            System.out.println("My Error "+ex);
        }
    }
}
