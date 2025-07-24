package com.salausmart.paygate.Exceptions;

import org.springframework.http.ResponseEntity;

import java.util.Map;

//@ControllerAdvice()
public class GlobalExceptionHandler {

//    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationError() {
        return null;
    }
}
