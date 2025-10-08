package main;

import config.config;
import dashboard.dashboard;
import java.util.Scanner;
import validation.validation;

public class main {


    public static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        config con = new config();

        validation vl = new validation();

        System.out.println("=====WELCOME TO MY SYSTEM=====");
        System.out.println("1. Log in   ");
        System.out.println("2. Register ");
        System.out.println("3. Exit     ");

        System.out.println("Choose an Option: ");
        int option = inp.nextInt();
        inp.nextLine();

        switch (option) {

            case 1:
                vl.login();
                break;

            case 2:
                vl.register();
                break;

        }

    }

    public static void loginDashboard() {

        String response;
        do {

            System.out.println("1. Add user: ");
            System.out.println("2. View user: ");
            System.out.println("3. Update user: ");
            System.out.println("4. Delete user: ");

            System.out.println("\nChoose an Option: ");
            int option = inp.nextInt();
            inp.nextLine();

            dashboard cd = new dashboard();

            switch (option) {

                case 1:
                    cd.addUser();
                    break;

                case 2:
                    cd.viewUser();
                    break;

                case 3:
                    cd.viewUser();
                    cd.updateUser();
                    break;

                case 4:
                    cd.viewUser();
                    cd.deleteUser();
                    break;
                case 5:
                    cd.viewUser();
                    cd.approveUser();
                    break;

                case 6:
                    main(null);
                    break;

            }

            System.out.println("Do you want to continue(yes/no): ");
            response = inp.nextLine();
        } while (response.equals("yes"));

    }

}
