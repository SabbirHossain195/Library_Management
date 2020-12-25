package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x=0;
        while(x==0) {
            System.out.println("Press 1: Admin");
            System.out.println("Press 2: Users\n");
            System.out.print("\nPress a number: ");
            Scanner scl = new Scanner(System.in);
            int a = scl.nextInt();
            System.out.println("\n");
            if (a == 1) {
                Admin admin = new Admin();
                admin.loginA();
            } else if (a == 2) {
                System.out.println("Press 1: Old User");
                System.out.println("Press 2: New User\n");
                System.out.print("\nPress a number: ");
                Scanner scu = new Scanner(System.in);
                int u = scu.nextInt();
                System.out.println("\n");
                Users user = new Users();
                if (u == 1) {
                    user.oldUser();
                } else if (u == 2) {
                    user.newUser();
                } else {
                    System.out.println("Invalid Option");
                }
            } else {
                System.out.println("Invalid Option");
            }

            System.out.println("\nPress 0 to finish the Project\nPress any number to continue\n");
            Scanner sy = new Scanner(System.in);
            int y = sy.nextInt();
            if(y==0)
            {
                x++;
            }
        }

    }
}
