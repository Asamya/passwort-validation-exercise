package de.bernhardscholz;

public class PasswordValidation {
    public static void main (String[] args) {
        String [] passwordArray = new String[4];
        passwordArray[0] = "ngk5867kdl2";
        passwordArray[1] = "aksdh1dffgig";
        passwordArray[2] = "nxckfj45@sdfjh5";
        passwordArray[3] = "";

        System.out.println(passwordArray[0]);
        System.out.println(checkPasswordForLenght10(passwordArray[3]));
        System.out.println(checkPasswordForNumbers(passwordArray[1]));
        System.out.println(checkPasswordForUppercaseLetters(passwordArray[1]));
        // System.out.println(validateArrayOfPasswords(passwordArray));
    }

    // Check if there is a string in the parameter
    /* static boolean checkPasswordForLength (String password) {
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

     */

    // Check if the password is greater than or equal to 10
    private static final int MINIMUM_LENGTH = 10;
    static boolean checkPasswordForLenght10 (String password) {
        return password.length() >= MINIMUM_LENGTH;
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

    // Check the password for uppercase letters
    static boolean checkPasswordForUppercaseLetters (String password) {
        String passwordToLowerCase = password.toLowerCase();
        return !password.equals(passwordToLowerCase);
    }

    // Check the password for lowercase letters
    static boolean checkPasswordForLowercaseLetters (String password) {
        String passwordToLowercase = password.toLowerCase();
        return password.equals(passwordToLowercase);
    }

    //Validate an Array of passwords
    static boolean isValidPassword (String password) {
        return checkPasswordForLenght10(password)
                && checkPasswordForNumbers(password)
                // && checkPasswordForLowercaseLetters(password);
                && checkPasswordForUppercaseLetters(password);
    }


}
