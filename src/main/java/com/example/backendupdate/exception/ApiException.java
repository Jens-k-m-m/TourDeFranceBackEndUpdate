package com.example.backendupdate.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
import java.util.Date;

public class ApiException {

  private final String message;
  private final HttpStatus httpStatus;
  private final ZonedDateTime zonedDateTime;

  private final Date dateTime;

  private final String description;

  public ApiException(String message,
                      HttpStatus httpStatus,
                      ZonedDateTime zonedDateTime, Date dateTime, String description) {
    this.message = message;
    this.httpStatus = httpStatus;
    this.zonedDateTime = zonedDateTime;
    this.dateTime = dateTime;
    this.description = description;
  }

  public String getMessage() {
    return message;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public ZonedDateTime getZonedDateTime() {
    return zonedDateTime;
  }

  public Date getDateTime() {
    return dateTime;
  }

  public String getDescription() {
    return description;
  }
}
