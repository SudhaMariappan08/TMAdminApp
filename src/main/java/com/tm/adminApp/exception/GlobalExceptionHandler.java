package com.tm.adminApp.exception;

import com.tm.adminApp.dto.ResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
  private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  public String getStackTraceAsString(Exception exception) {
    StringBuilder stackTrace = new StringBuilder();
    for(StackTraceElement element : exception.getStackTrace()) {
      stackTrace.append(element.toString()).append("\n");
    }
    return stackTrace.toString();
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ResponseDTO<String>> handleException(Exception exception) {
    LOGGER.error("Exception occurred: ", exception);
    String stackTrace = getStackTraceAsString(exception);
    ResponseDTO<String> response = new ResponseDTO<>(true, HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage(), stackTrace);
    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
