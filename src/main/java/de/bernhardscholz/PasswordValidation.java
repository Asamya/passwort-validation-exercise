package de.bernhardscholz;

public class PasswordValidation {
    public static void main (String[] args) {
        String [] passwordArray = new String[4];
        passwordArray[0] = "ngk5867kdl2";
        passwordArray[1] = "aksdh1dffgig";
        passwordArray[2] = "nxckfj45@sdfjh5";
        passwordArray[3] = "";

        System.out.println(passwordArray[0]);
        System.out.println(checkPasswordForLength(passwordArray[3]));
        System.out.println(checkPasswordForNumbers(passwordArray[1]));
        System.out.println(checkPasswordForUpperAndLowerCaseLetters(passwordArray[1]));
        // System.out.println(validateArrayOfPasswords(passwordArray));
    }

    // Check if there is a string in the parameter
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
        return (password.equals(passwordToLowerCase));
    }


    // This is work in Progress and doesn`t work as expected
    // Validate an array of passwords

    /* static boolean validateArrayOfPasswords (String[] passwords) {
        boolean result = false;
        for (String i : passwords) {
            if ((checkPasswordForLength(i) && checkPasswordForNumbers(i) && checkPasswordForUpperAndLowerCaseLetters(i)) == true) {
                result = true;
            }
        }
        return result;
    }

     */

}
