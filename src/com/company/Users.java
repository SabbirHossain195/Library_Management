package com.company;

import java.util.Scanner;

public class Users {
    public void oldUser()
    {
        System.out.print("\nEnter UserID: ");
        Scanner sci = new Scanner(System.in);
        int id = sci.nextInt();
        System.out.println("\n");
        System.out.print("\nEnter UserName: ");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("\n");

        System.out.println("\n");
        System.out.println("Press 1: Show User List");
        System.out.println("Press 2: Show Book List");
        System.out.println("Press 3: To Search Book");
        System.out.print("\nEnter a number: ");
        Scanner scosi = new Scanner(System.in);
        int c = scosi.nextInt();
        System.out.println("\n");
        if(c==1)
        {
            UserList userList = new UserList();
            userList.userlistOperation();
        }

        else if(c==2)
        {
            BookList bookList = new BookList();
            bookList.booklistOperation();
        }

        else if(c==3)
        {
            SearchBook searchBook = new SearchBook();
            searchBook.searchbookOperation();
        }

        else
        {
            System.out.println("\nInvalid Option\n");
        }

    }

    public void newUser()
    {
        AddUser nu = new AddUser();
        nu.adduserOperation();
        System.out.println("\n");
        System.out.println("Your Registration is complete\n");
        System.out.println("Press 1: Show User List");
        System.out.println("Press 2: Show Book List");
        System.out.println("Press 3: To Search Book");
        System.out.print("\nEnter a number: ");
        Scanner scnsi = new Scanner(System.in);
        int d = scnsi.nextInt();
        System.out.println("\n");
        if(d==1)
        {
            UserList userList = new UserList();
            userList.userlistOperation();
        }

        else if(d==2)
        {
            BookList bookList = new BookList();
            bookList.booklistOperation();
        }

        else if(d==3)
        {
            SearchBook searchBook = new SearchBook();
            searchBook.searchbookOperation();
        }

        else
        {
            System.out.println("\nInvalid Option\n");
        }
    }
}
