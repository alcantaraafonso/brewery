package br.com.beganinha.brewery.web.controller;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.BindException;
import java.util.ArrayList;
import java.util.List;

/**
 * The @ControllerAdvice annotation tells to Spring to look to this class looking for advices.
 * In this particular case, this class centralizes all Exception Handler that client receives during a request
 */
@ControllerAdvice
public class MvcExceptionHandler {

    /**
     * This Method is invoked automatically by Spring to handle all exception has been thrown by Bean Validation and has been validated by @Valid annotation
     * @param e
     * @return
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e) {
        List<String> errors = new ArrayList<>(e.getConstraintViolations().size());
        e.getConstraintViolations().forEach(constraintViolation -> {
            errors.add(constraintViolation.getPropertyPath() + " : " + constraintViolation.getMessage());
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<String> handleBindingException(BindException e) {
       return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
