package de.bernhardscholz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    @DisplayName("Passwordlength is greater than 0?")
    public void checkLenghtOfPassword () {
        //Given
        String passwordLength = "";

        //When
        int checkPasswordLength = PasswordValidation.checkPasswordForLength(passwordLength);

        //Then
        Assertions.assertNotEquals(0, checkPasswordLength);
    }
}