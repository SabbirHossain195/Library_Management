package com.company;

import java.util.Scanner;

public class Admin {
    public void loginA()
    {
        System.out.print("\nEnter Username: ");
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        System.out.print("\nEnter Password: ");
        Scanner scp = new Scanner(System.in);
        String p = scp.nextLine();
        System.out.println("\n\n");
        int x=0;
        while(x==0) {
            System.out.println("Press 1: Show User List");
            System.out.println("Press 2: Show Book List");
            System.out.println("Press 3: Add User in List");
            System.out.println("Press 4: Add Book in List");
            System.out.println("Press 5: Edit User Information in List");
            System.out.println("Press 6: Edit Book Information in List");
            System.out.println("Press 7: Remove User from List");
            System.out.println("Press 8: Delete Book from List");
            System.out.println("Press 9: To Search Book from List");
            System.out.println("\n");
            System.out.print("Enter a number: ");
            Scanner sca = new Scanner(System.in);
            int b = sca.nextInt();
            System.out.println("\n");
            if (b == 1) {
                UserList userList = new UserList();
                userList.userlistOperation();
            }
            else if (b == 2) {
                BookList bookList = new BookList();
                bookList.booklistOperation();
            }
            else if (b == 3) {
                AddUser addUser = new AddUser();
                addUser.adduserOperation();
            }
            else if (b == 4) {
                AddBook addBook = new AddBook();
                addBook.addbookOperation();
            }
            else if (b == 5) {
                EditUserInfo editUserInfo = new EditUserInfo();
                editUserInfo.edituserOperation();

            }
            else if (b == 6) {
                EditBookInfo editBookInfo = new EditBookInfo();
                editBookInfo.editbookOperation();

            }
            else if (b == 7) {
                RemoveUser removeUser = new RemoveUser();
                removeUser.removeuserOperation();
            }
            else if (b == 8) {
                DeleteBook deleteBook = new DeleteBook();
                deleteBook.deletebookOperation();
            }
            else if(b == 9) {
                SearchBook searchBook = new SearchBook();
                searchBook.searchbookOperation();
            }
            else {
                System.out.println("\nInvalid Option\n");
            }
            System.out.println("\nPress 0 to exit from Admin\nPress any number to continue\n");
            Scanner sy = new Scanner(System.in);
            int y = sy.nextInt();
            if(y==0)
            {
                x++;
            }
        }


    }

}
