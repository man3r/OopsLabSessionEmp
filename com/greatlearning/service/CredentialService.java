package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.Employee;

public class CredentialService {

    String caps_l = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String small_l = "abcdefghijklmnopqrstuvwxy";
    String num = "123456789";
    String spe_char = "!@#$%^&*_=+-/.?<>)";
    String finalString = caps_l + small_l + num + spe_char;

    public CredentialService() {

    }

    public String generatePassword() {
        char[] pwd = new char[8];
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            pwd[i] = finalString.charAt(rand.nextInt(finalString.length()));
        }

        return pwd.toString();
    }

    public String generateEmailAddress(String fn, String ln, String dep) {
        var email = fn + ln + "@" + dep + ".abc.com";
        return email;
    }

    public String generateCredentials(Employee emp, String eID, String pwd) {

        String s1 = "Dear ";
        String s2 = " your generated credentials are as follows ";
        String s3 = "Email --> ";
        String s4 = "Password --> ";

        String l1 = s1 + emp.getFirstName() + s2 + "\n";
        String l2 = s3 + eID + "\n";
        String l3 = s4 + pwd + "\n";

        return l1 + l2 + l3;
    }
}
