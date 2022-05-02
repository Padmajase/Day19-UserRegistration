package com.bridgelabz.day19Userregistration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
    static Logger log = Logger.getLogger(User.class);
    static Scanner sc = new Scanner(System.in);

    // Assigning valid pattern to some reference variables  
    private final firstNamePattern = "^[A-Za-z]\\w{3,}$";
    private final lastNamePattern = "^[A-Za-z]\\w{3,}$";
    private final phoneNumberPattern = "91+[\\s][1-9]{10}";
    private final emailPattern = "[a-zA-Z0-9_.-]+@+[a-zA-z-_.0-9]+[comaunet]";
    private final passwordPattern = "[[A-Z0-9[a-z]{*}][@$._-]{1}]{8,}";

    //checking user input matches with pattern or not
    static String Input() {
        System.out.println("First Name :");
        String firstName = sc.nextLine();
        System.out.println((Pattern.matches(firstNamePattern, firstName)));

        System.out.println("Last Name :");
        String lastName = sc.nextLine();
        System.out.println((Pattern.matches(lastNamePattern, lastName)));

        System.out.println("Email :");
        String email = sc.nextLine();
        System.out.println((Pattern.matches(emailPattern, email)));//generating pattern for all given email pattern

        System.out.println("phone :");
        String mobNumber = sc.nextLine();
        System.out.println((Pattern.matches(phoneNumberPattern, mobNumber)));

        System.out.println("password :");
        String password = sc.nextLine();
        System.out.println((Pattern.matches(passwordPattern, password))); // matching password with exactly one special character in password

        return firstName + " " + lastName + " " + email + " " + mobNumber + " " + kpassword;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Input();
    }
}




