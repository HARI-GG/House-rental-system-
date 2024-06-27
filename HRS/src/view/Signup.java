package src.view;

import java.sql.SQLException;
import java.util.Scanner;

import src.model.Owner;
import src.model.User;

public class Signup {
    static Scanner sc = new Scanner(System.in);
    // static User use=new User();

    public static void user() throws SQLException {

        System.out.println("Enter username :");
        String name = sc.nextLine();
        System.out.println("Enter email :");
        String email = sc.nextLine();
        System.out.println("Enter Phone number :");
        String ph = sc.nextLine();
        String pass="";
        while (true) {
            System.out.println("Enter Password :");
            pass = sc.nextLine();
            System.out.println("Confirm Password :");
            String cpass = sc.nextLine();

            if (!pass.equals(cpass)) {
                System.out.println("! Enter correct password ");
            } else {

                break;
            }
        }
        User.login(name,email,pass,ph);

    }

    public static void owner() throws SQLException {

        System.out.println("Enter username :");
        String name = sc.nextLine();
        System.out.println("Enter email :");
        String email = sc.nextLine();
        System.out.println("Enter Phone number :");
        String ph = sc.nextLine();
        String pass="";
        while (true) {
            System.out.println("Enter Password :");
            pass = sc.nextLine();
            System.out.println("Confirm Password :");
            String cpass = sc.nextLine();

            if (!pass.equals(cpass)) {
                System.out.println("! Enter correct password ");
            } else {

                break;
            }
        }
        Owner.loginowner(name,email,pass,ph);
    }

}
