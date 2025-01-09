package com.tm.adminApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ResponseDTO<T> implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean isError;

  private Integer code;

  private String message;

  private String stackTrace;

  private transient T payload;

  public ResponseDTO(Boolean isError, Integer code, String message, T payload) {
    this.isError = isError;
    this.code = code;
    this.message = message;
    this.payload = payload;
  }

  public ResponseDTO(Boolean isError, Integer code, String message, String stackTrace) {
    this.isError = isError;
    this.code = code;
    this.message = message;
    this.stackTrace = stackTrace;
  }

  public Boolean getIsError() {
    return this.isError;
  }

  public void setIsError(Boolean isError) {
    this.isError = isError;
  }

  public Integer getCode() {
    return this.code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStackTrace() {
    return this.stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public T getPayload() {
    return this.payload;
  }

  public void setPayload(T payload) {
    this.payload = payload;
  }
}
