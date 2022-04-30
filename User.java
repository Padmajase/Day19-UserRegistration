package com.bridgelabz.day19Userregistration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
    static Logger log = Logger.getLogger(User.class);
    static Scanner sc = new Scanner(System.in);

    static void Input() {
        System.out.println("First Name :");
        String firstName = sc.nextLine();
        System.out.println((Pattern.matches("^[A-Za-z]\\w{3,}", firstName)));

        System.out.println("Last Name :");
        String lastName = sc.nextLine();
        System.out.println((Pattern.matches("^[A-Za-z]\\w{3,}", lastName)));

    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Input();
    }
}




