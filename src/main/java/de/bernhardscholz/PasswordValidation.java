package de.bernhardscholz;

public class PasswordValidation {
    public static void main (String[] args) {
        String [] passwordArray = new String[10];
        passwordArray[0] = "ngk5867kdl2";
        passwordArray[1] = "aksdHdffgig";

        System.out.println(passwordArray[0]);
        System.out.println(checkPasswordForLength(passwordArray[0]));
        System.out.println(checkPasswordForNumbers(passwordArray[1]));
        System.out.println(checkPasswordForUpperAndLowerCaseLetters(passwordArray[1]));
    }

    // Check and give back the length of the password
    static boolean checkPasswordForLength (String password) {
        int result = 0;
        for (int i = 0; i < password.length(); i++){
            result = result + 1;
        }
        if (result <= 0) {
            return false;
        } else {
            return true;
        }
    }

    // Check the password for numbers
    static boolean checkPasswordForNumbers (String password) {
        boolean result = false;
        String [] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < password.length(); j++) {
                    if (password.contains(numbers[i])) {
                        result = true;
                }
            }

        }
        return result;
    }

    // Check the password for upper- and lowercase letters
    static boolean checkPasswordForUpperAndLowerCaseLetters (String password) {
        String passwordToLowerCase = password.toLowerCase();
        return (!password.equals(passwordToLowerCase));
    }


}
