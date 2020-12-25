package com.company;

import java.sql.*;
import java.util.Scanner;

public class AddUser {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    public void adduserOperation()
    {
        try
        {
            connect = ApiClient.getInstance();

            System.out.print("\nEnter Name: ");
            Scanner scn = new Scanner(System.in);
            String un = scn.nextLine();
            System.out.print("\nEnter Contact Number: ");
            Scanner scc = new Scanner(System.in);
            String uc = scc.nextLine();
            System.out.print("\nEnter E-mail: ");
            Scanner sce = new Scanner(System.in);
            String ue = sce.nextLine();
            System.out.println("\n");

            connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
            String query = "INSERT INTO user_list(UserName, ContactNumber, Email)" + "VALUES(?,?,?)";

            PreparedStatement preparedstatement = connect.prepareStatement(query);
            preparedstatement.setString (1, un);
            preparedstatement.setString (2, uc);
            preparedstatement.setString (3, ue);

            preparedstatement.execute();
            connect.close();

        }
        catch (SQLException | ClassNotFoundException ex)
        {
            System.out.println("My Error "+ex);
        }
    }

}
