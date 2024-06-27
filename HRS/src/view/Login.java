package src.view;

import java.util.Scanner;

import src.controller.LoginAuth;

public class Login {
    static Scanner sc=new Scanner(System.in);

    static void user(){
        
        System.out.println("Enter email : ");
        String email=sc.nextLine();
        System.out.println("Enter password : ");
        String pass=sc.nextLine();
        try{
            LoginAuth.user(email,pass);
            System.out.println("User Login successfull");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void owner(){
        
        System.out.println("Enter email : ");
        String email=sc.nextLine();
        System.out.println("Enter password : ");
        String pass=sc.nextLine();
        try{
            LoginAuth.owner(email,pass);
            System.out.println("Owner Login successfull");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void admin(){
        
        System.out.println("Enter email : ");
        String email=sc.nextLine();
        System.out.println("Enter password : ");
        String pass=sc.nextLine();
        try{
            LoginAuth.admin(email,pass);
            System.out.println("Admin Login successfull");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
