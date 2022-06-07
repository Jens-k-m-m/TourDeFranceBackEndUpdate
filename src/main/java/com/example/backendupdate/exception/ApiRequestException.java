package com.example.backendupdate.exception;

public class ApiRequestException  extends RuntimeException{
  public ApiRequestException(String massage) {
    super(massage);
  }
}
