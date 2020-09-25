package de.bernhardscholz;

public class PasswordValidation {
    static void main (String[] args) {
        String [] passwordArray = new String[10];
        passwordArray[0] = "ngk5867kdl2";

        System.out.println(passwordArray[0]);
        System.out.println(checkPasswordForLength(passwordArray[0]));
    }


    static int checkPasswordForLength (String password) {
        int result = 0;
        for (int i = 0; i < password.length(); i++){
            result = result + i;
        }
        return result;
    }

}
