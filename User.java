package com.bridgelabz.day19Userregistration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
    static Logger log = Logger.getLogger(User.class);
    static Scanner sc = new Scanner(System.in);

    //checking user input matches with pattern or not
    static void Input() {
        System.out.println("First Name :");
        String firstName = sc.nextLine();
        System.out.println((Pattern.matches("^[A-Za-z]\\w{3,}", firstName)));

        System.out.println("Last Name :");
        String lastName = sc.nextLine();
        System.out.println((Pattern.matches("^[A-Za-z]\\w{3,}", lastName)));

        System.out.println("Email :");
        String email = sc.nextLine();
        System.out.println((Pattern.matches("[a-zA-Z0-9_.-]+@+[a-zA-Z0-9.-]+com", email)));

        System.out.println("phone :");
        String mobNumber = sc.nextLine();
        System.out.println((Pattern.matches("91+[\\s][1-9]{10}", mobNumber)));

        System.out.println("phone :");
        String password = sc.nextLine();
        System.out.println((Pattern.matches("[A-Za-z]{8,}", password))); // matching password with minimum 8 characters
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Input();
    }
}




