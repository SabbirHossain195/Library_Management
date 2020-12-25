package com.company;

import java.sql.*;
import java.util.Scanner;

public class AddBook {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    public void addbookOperation()
    {
        try
        {
            connect = ApiClient.getInstance();

            System.out.print("\nEnter Book Name: ");
            Scanner scbn = new Scanner(System.in);
            String bn = scbn.nextLine();
            System.out.print("\nEnter Book Author: ");
            Scanner sca = new Scanner(System.in);
            String ba = sca.nextLine();
            System.out.print("\nEnter Fee: ");
            Scanner scf = new Scanner(System.in);
            String bf = scf.nextLine();
            System.out.println("\n");

            connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
            String query = "INSERT INTO book_list(BookName, Author, Fee)" + "VALUES(?,?,?)";

            PreparedStatement preparedstatement = connect.prepareStatement(query);
            preparedstatement.setString (1, bn);
            preparedstatement.setString (2, ba);
            preparedstatement.setString (3, bf);

            preparedstatement.execute();
            connect.close();

        }
        catch (SQLException | ClassNotFoundException ex)
        {
            System.out.println("My Error "+ex);
        }
    }

}