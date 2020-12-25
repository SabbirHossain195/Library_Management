package com.company;

import java.sql.*;
import java.util.Scanner;

public class SearchBook {

    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;
    Scanner sc = null;


    void searchbookOperation()
    {
        try {
            int x = 0;

            connect = ApiClient.getInstance();
            sc = new Scanner(System.in);

            preparedStatement = connect.prepareStatement("SELECT * FROM book_list WHERE BookName=?");
            while(x==0)
            {
                System.out.print("\nEnter a Book Name: ");
                preparedStatement.setString(1, sc.nextLine());
                result = preparedStatement.executeQuery();
                System.out.println("\n");

                while(result.next())
                {
                    System.out.println("Book ID: "+result.getString("BookID"));
                    System.out.println("Book Name: "+result.getString("BookName"));
                    System.out.println("Book Author: "+result.getString("Author"));
                    System.out.println("Book Fee: "+result.getString("Fee"));
                }
                System.out.println("\nPress 0 to exit from Search Book\nPress any number to continue\n");
                Scanner sy = new Scanner(System.in);
                int y = sy.nextInt();
                if(y==0)
                {
                    x++;
                }

            }



        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("My Error: "+ex);
        }
    }

}
