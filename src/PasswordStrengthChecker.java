import java.util.Scanner;
public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;
        String inc;
        int strength = 0;
        boolean done = false;
        boolean checker = false;

        do {
            password = InputHelper.getNonZeroLenString(scan, "Please enter your password");
            if (password.length() < 12) {
                System.out.println("Your password needs to be at least 12 characters long");
            }
            else {
                strength++;
            }
            for (int i = 0; i < password.length(); i++) {
               inc = password.substring(i, i+1);
                if (inc.matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]")) {
                    checker = true;
                }
            }
            if (checker) {
                strength++;
                checker = false;
            } else {
                System.out.println("Your password needs an uppercase");
            }

            for (int i = 0; i < password.length(); i++) {
                inc = password.substring(i, i+1);
                if (inc.matches("[abcdefghijklmnopqrstuvwxyz]")) {
                    checker = true;
                }
            }
            if (checker) {
                strength++;
                checker = false;
            } else {
                System.out.println("Your password needs a lowercase");
            }
            for (int i = 0; i < password.length(); i++) {
                inc = password.substring(i, i+1);
                if (inc.matches("[1234567890]")) {
                    checker = true;
                }
            }
            if (checker) {
                strength++;
                checker = false;
            } else {
                System.out.println("Your password needs a number [0-9]");
            }
            for (int i = 0; i < password.length(); i++) {
                inc = password.substring(i, i+1);
                if (inc.matches("[!#$%]")) {
                    checker = true;
                }
            }
            if (checker) {
                strength++;
                checker = false;
            } else {
                System.out.println("Your password needs one special character[!#$%]");
            }
            if (strength <= 2){
                System.out.println("Your password passed " + strength + "/5 tests, your password is weak");
            } else if (strength == 3) {
                System.out.println("Your password passed " + strength + "/5 tests, your password is medium");
            } else {
                System.out.println("Your password passed " + strength + "/5 tests, your password is strong");
            }
            done = InputHelper.getYNConfirm(scan, "Do you want to continue Y/N");
            password = "";
            strength = 0;
        } while (!done);
    }
}