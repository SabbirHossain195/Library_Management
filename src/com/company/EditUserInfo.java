package com.company;

import java.sql.*;
import java.util.Scanner;

public class EditUserInfo {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    public void edituserOperation()
    {

        try
        {
            connect = ApiClient.getInstance();

            int x = 0;
            while(x==0) {
                System.out.println("Press 1: To Change User Name");
                System.out.println("Press 2: To Change Contact Number");
                System.out.println("Press 3: To Change E-mail");
                System.out.print("\nEnter a number: ");
                Scanner sceui = new Scanner(System.in);
                int eui = sceui.nextInt();
                System.out.println("\n");
                if (eui == 1) {
                    System.out.print("\nEnter User Name Alter: ");
                    Scanner scna = new Scanner(System.in);
                    String na = scna.nextLine();
                    System.out.println("\n");

                    System.out.print("\nEnter the User Name Alter to: ");
                    Scanner scat = new Scanner(System.in);
                    String at = scat.nextLine();
                    System.out.println("\n");

                    connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
                    String query = "UPDATE user_list SET UserName=? WHERE UserName=?";

                    PreparedStatement preparedstatement = connect.prepareStatement(query);
                    preparedstatement.setString(1, na);
                    preparedstatement.setString(2, at);

                    preparedstatement.execute();
                    connect.close();

                } else if (eui == 2) {
                    System.out.print("\nEnter Contact Number Alter: ");
                    Scanner sccn = new Scanner(System.in);
                    String cn = sccn.nextLine();
                    System.out.println("\n");

                    System.out.print("\nEnter the Contact Number Alter to: ");
                    Scanner scnat = new Scanner(System.in);
                    String nat = scnat.nextLine();
                    System.out.println("\n");

                    connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
                    String query = "UPDATE user_list SET ContactNumber=? WHERE ContactNumber=?";

                    PreparedStatement preparedstatement = connect.prepareStatement(query);
                    preparedstatement.setString(1, cn);
                    preparedstatement.setString(2, nat);

                    preparedstatement.execute();
                    connect.close();

                } else if (eui == 3) {
                    System.out.print("\nEnter E-mail Alter: ");
                    Scanner scea = new Scanner(System.in);
                    String ea = scea.nextLine();
                    System.out.println("\n");

                    System.out.print("\nEnter the E-mail Alter to: ");
                    Scanner sceat = new Scanner(System.in);
                    String eat = sceat.nextLine();
                    System.out.println("\n");

                    connect = DriverManager.getConnection("jdbc:mysql://localhost/library_management?" + "user=root");
                    String query = "UPDATE user_list SET Email=? WHERE Email=?";

                    PreparedStatement preparedstatement = connect.prepareStatement(query);
                    preparedstatement.setString(1, ea);
                    preparedstatement.setString(2, eat);

                    preparedstatement.execute();
                    connect.close();

                } else {
                    System.out.println("\nInvalid Option\n");
                }

                System.out.println("\nPress 0 to exit from User List Edit\nPress any number to continue\n");
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
