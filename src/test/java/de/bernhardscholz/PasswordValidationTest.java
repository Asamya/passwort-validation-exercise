package de.bernhardscholz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    @DisplayName("Passwordlength is greater than 0?")
    public void checkLenghtOfPassword() {
        //Given
        String passwordLength = "dkfjkdjf";

        //When
        boolean checkPasswordLength = PasswordValidation.checkPasswordForLength(passwordLength);

        //Then
        Assertions.assertTrue(checkPasswordLength);
    }

    @Test
    @DisplayName("Password contains numbers?")
    public void checkPasswordForNumbers() {
        // Given
        String passwordWithNumber = "dfjsjf55";

        // When
        boolean checkPasswordWithNumber = PasswordValidation.checkPasswordForNumbers(passwordWithNumber);

        // Then
        Assertions.assertTrue(checkPasswordWithNumber);
    }

    @Test
    @DisplayName("Password contains only lowercase letters")
    public void checkPasswordForLowercase() {
        // Given
        String passwordWithLowercase = "kfjkfgj";

        // When
        boolean checkPasswordWithLowercase = PasswordValidation.checkPasswordForUpperAndLowerCaseLetters(passwordWithLowercase);

        // then
        Assertions.assertTrue(checkPasswordWithLowercase);
    }

    @Test
    @DisplayName("Password contains only uppercase letters")
    public void checkPasswordForUppercase() {
        // Given
        String passwordWithUppercase = "UHDNFJRHE";

        // When
        boolean checkPasswordWithUppercase = PasswordValidation.checkPasswordForUpperAndLowerCaseLetters(passwordWithUppercase);

        // then
        Assertions.assertTrue(checkPasswordWithUppercase);
    }

    @Test
    @DisplayName("Password contains lower- and uppercase letters?")
    public void checkPasswordForUpperAndLowercase() {
        //Given
        String passwordWithUpperAndLowercase = "LHFunfhLFK";

        //When
        boolean checkPasswordWithUpperAndLowercase = PasswordValidation.checkPasswordForUpperAndLowerCaseLetters(passwordWithUpperAndLowercase);

        //Then
        assertTrue(checkPasswordWithUpperAndLowercase);
    }

    /*
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "   "})
    public void validatePasswordsOfArray() {
        //Given
        String[] passwords = {"dfjsjf3", " ","sdfkjsdkfj"};

        // When
        boolean validationOfPasswordsInArray = PasswordValidation.validateArrayOfPasswords(passwords);

        // Then
        assertTrue(validationOfPasswordsInArray);
    }
     */



    /* This is not working


    @Test
    @DisplayName("Array contains valid passwords?")
    public void validatePasswordsOfArray() {
        //Given
        String[] passwords = {"dfjsjf3", "sdfkjslj20","sdfkjsdkfj"};

        //When
        boolean validationOfPasswordsInArray = PasswordValidation.validateArrayOfPasswords(passwords);

        //Then
        assertTrue(validationOfPasswordsInArray);
    }

     */
}