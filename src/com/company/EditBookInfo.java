package com.company;

import java.sql.*;
import java.util.Scanner;

public class EditBookInfo {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    public void editbookOperation()
    {

        try
        {
            connect = ApiClient.getInstance();

            int x = 0;
            while(x==0) {
                System.out.println("Press 1: To Change Book Name");
                System.out.println("Press 2: To Change Book Author");
                System.out.println("Press 3: To Change Book Fee");
                System.out.print("\nEnter a number: ");
                Scanner scebi = new Scanner(System.in);
                int ebi = scebi.nextInt();
                System.out.println("\n");
                if (ebi == 1) {
                    System.out.print("\nEnter Book Name Alter: ");
                    Scanner scbna = new Scanner(System.in);
                    String bna = scbna.nextLine();
                    System.out.println("\n");

                    System.out.print("\nEnter the Book Name Alter to: ");
                    Scanner scbat = new Scanner(System.in);
                    String bat = scbat.nextLine();
                    System.out.println("\n");

                    connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
                    String query = "UPDATE book_list SET BookName=? WHERE BookName=?";

                    PreparedStatement preparedstatement = connect.prepareStatement(query);
                    preparedstatement.setString(1, bna);
                    preparedstatement.setString(2, bat);

                    preparedstatement.execute();
                    connect.close();

                } else if (ebi == 2) {
                    System.out.print("\nEnter Book Author Alter: ");
                    Scanner scba = new Scanner(System.in);
                    String ba = scba.nextLine();
                    System.out.println("\n");

                    System.out.print("\nEnter the Book Author Alter to: ");
                    Scanner scbat = new Scanner(System.in);
                    String bat = scbat.nextLine();
                    System.out.println("\n");

                    connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
                    String query = "UPDATE book_list SET Author=? WHERE Author=?";

                    PreparedStatement preparedstatement = connect.prepareStatement(query);
                    preparedstatement.setString(1, ba);
                    preparedstatement.setString(2, bat);

                    preparedstatement.execute();
                    connect.close();

                } else if (ebi == 3) {
                    System.out.print("\nEnter Book Fee Alter: ");
                    Scanner scbf = new Scanner(System.in);
                    String bf = scbf.nextLine();
                    System.out.println("\n");

                    System.out.print("\nEnter the Book Fee Alter to: ");
                    Scanner scbft = new Scanner(System.in);
                    String bft = scbft.nextLine();
                    System.out.println("\n");

                    connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
                    String query = "UPDATE user_list SET Email=? WHERE Email=?";

                    PreparedStatement preparedstatement = connect.prepareStatement(query);
                    preparedstatement.setString(1, bf);
                    preparedstatement.setString(2, bft);

                    preparedstatement.execute();
                    connect.close();

                } else {
                    System.out.println("\nInvalid Option\n");
                }

                System.out.println("\nPress 0 to exit from Book List Edit\nPress any number to continue\n");
                Scanner sy = new Scanner(System.in);
                int y = sy.nextInt();
                if(y==0)
                {
                    x++;
                }
            }

        }
        catch(SQLException | ClassNotFoundException ex)
        {
            System.out.println("My Error "+ex);
        }
    }
}
