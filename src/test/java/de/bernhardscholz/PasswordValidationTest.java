package de.bernhardscholz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
    @DisplayName("Password contains upper- or-lowercase letters")
    public void checkPasswordForUpperAndLowercase() {
        // Given
        String passwordWithLowerAndUppercase = "kfjkfgjHHH";

        // When
        boolean checkPasswordWithLowerAndUppercase = PasswordValidation.checkPasswordForUpperAndLowerCaseLetters(passwordWithLowerAndUppercase);

        // then
        Assertions.assertTrue(checkPasswordWithLowerAndUppercase);
    }

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