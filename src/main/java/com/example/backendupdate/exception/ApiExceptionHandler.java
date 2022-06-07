package com.example.backendupdate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@ControllerAdvice
public class ApiExceptionHandler {

  @ExceptionHandler(value = {ApiRequestException.class})
  public ResponseEntity<Object> handleApiReguestException(ApiRequestException e, WebRequest request){
    // 1. Create Payload containing exception details

//    public ApiException(String message,Throwable throwable,HttpStatus httpStatus,ZonedDateTime zonedDateTime) {
    HttpStatus badRequest = HttpStatus.BAD_REQUEST;

    ApiException apiException = new ApiException(
        "Men kan få text ud her med så "+ e.getMessage(),
        badRequest,ZonedDateTime.now(ZoneId.of("GMT+2")),
        new Date(), request.getDescription(false));
    // 2. Return response entity
    return new ResponseEntity<>(apiException,badRequest);
  }
}
