package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String id1="sushma@gmail.com";
        if(checkValidEmail(id1)){
            System.out.println("Email is valid");

        }
        else{
            System.out.println("Invalid email");
        }
    }
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private static boolean checkValidEmail( String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
        return matcher.find();
    }
}
