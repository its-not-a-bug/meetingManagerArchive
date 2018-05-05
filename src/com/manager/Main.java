package com.manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLEASE LOG IN");
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (login.equals(UserSettings.login) || password.equals(UserSettings.password)) {

            System.out.println("Hello " + UserSettings.name + "!");
            System.out.println("What should we do?");
            System.out.println(" 1. Add appointment");
            System.out.println(" 2. Edit appointment");
            System.out.println(" 3. Delete appointment");
            System.out.println(" 4. Show appointments");

            System.out.print("Your choice: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("edit");
                    break;
                case 3:
                    System.out.println("delete");
                    break;
                case 4:
                    System.out.println("show");
                    break;
                default:
                    break;
            }
        }
        else {
                System.out.println("Sorry, wrong credentials!");
            }
    }
}