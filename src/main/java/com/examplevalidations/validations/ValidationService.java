package com.examplevalidations.validations;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;
@Service
public class ValidationService {
    public boolean validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }

    public boolean validateBirthDate(String birthDate) {
        // Implementar lógica para validar la fecha de nacimiento (formato y comparación)
        return true; // Placeholder
    }

    public boolean validateTitle(String title) {
        String[] validTitles = {"Haematologist", "Phytotherapist", "Building Surveyor", "Insurance Account Manager", "Educational Psychologist"};
        for (String validTitle : validTitles) {
            if (validTitle.equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

}
