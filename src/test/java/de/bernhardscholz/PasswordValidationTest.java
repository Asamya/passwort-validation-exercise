package de.bernhardscholz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @ParameterizedTest(name = "Password is greater than or equal to 10: {1}")
    @CsvSource({
            "abkdjfkRJ6, true",
            "akdngn, false"
    })
    public void checkLenghtOfPassword(String password, boolean result) {
        boolean isGreaterThan10 = PasswordValidation.checkPasswordForLenght10(password);

        assertEquals(isGreaterThan10, result);
    }

    @ParameterizedTest(name = "Password contains numbers: {1}")
    @CsvSource({
            "abfkrk5l68, true",
            "akdfjHJfk, false"
    })
    public void checkPasswordForNumbers(String password, boolean result) {
        // When
        boolean checkPasswordForNumberTest = PasswordValidation.checkPasswordForNumbers(password);

        // Then
        assertEquals(checkPasswordForNumberTest, result);
    }

    @ParameterizedTest(name = "Does password have uppercase letters: {1}")
    @CsvSource({
            "DFDjgkdn45, true",
            "fkgjfdjg, false"
    })
    public void checkPasswordForUppercase(String password, boolean result) {
        // When
        boolean checkPasswordWithLowercase = PasswordValidation.checkPasswordForUppercaseLetters(password);

        // then
        assertEquals(checkPasswordWithLowercase, result);
    }

    @ParameterizedTest(name = "Does password have lowercase letters: {1}")
    @CsvSource({
            "DFDjgkdn45, false",
            "fkgjfdjg, true"
    })
    public void checkPasswordForLowercase(String password, boolean result) {
        // When
        boolean checkPasswordWithUppercase = PasswordValidation.checkPasswordForLowercaseLetters(password);

        // then
        assertEquals(checkPasswordWithUppercase, result);
    }


    @ParameterizedTest(name = "Array of passwords is valid: {1}")
    @CsvSource({
            "passWord123, true",
            "password123, false",
            "password, false",
            "pass123word, false",
            "pass123Word, true"
    })
    public void checkAndValidateArrayOfPasswords(String password, boolean expected) {
        boolean checkForValidateArray = PasswordValidation.isValidPassword(password);

        assertEquals(expected, checkForValidateArray);
    }
}