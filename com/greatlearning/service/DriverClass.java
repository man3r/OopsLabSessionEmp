package com.greatlearning.service;

import java.util.Scanner;
import com.greatlearning.model.*;

public class DriverClass {

    public static void main(String[] args) {
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fn = sc.nextLine();

        System.out.println("Enter your last name: ");
        String ln = sc.nextLine();

        System.out.println("Enter your Dept: ");
        String opt = sc.nextLine();

        String dept = "";

        if (opt.equals("1")) {
            dept = "tech";
        } else if (opt.equals("2")) {
            dept = "adm";
        } else if (opt.equals("3")) {
            dept = "hr";
        } else if (opt.equals("4")) {
            dept = "lgl";
        }

        System.out.println("dept: " + dept);

        Employee emp = new Employee(fn, ln);
        CredentialService cs = new CredentialService();
        String pwd = cs.generatePassword();
        String email = cs.generateEmailAddress(fn, ln, dept);
        String creds = cs.generateCredentials(emp, email, pwd);

        System.out.println(creds);

        sc.close();
    }
}
