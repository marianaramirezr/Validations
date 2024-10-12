package com.examplevalidations.validations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @Autowired
    private ValidationService validationService;

    @PostMapping("/validate")
    public ResponseEntity<Boolean> validateRecord(@RequestBody Record record) {
        boolean isEmailValid = validationService.validateEmail(record.getEmail());
        boolean isBirthDateValid = validationService.validateBirthDate(record.getBirthDate());
        boolean isTitleValid = validationService.validateTitle(record.getTitle());


        boolean isValid = isEmailValid && isBirthDateValid && isTitleValid;

        return ResponseEntity.ok(isValid);
    }
}

