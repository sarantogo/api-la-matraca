package com.sarademo.apilamatraca.dtos;

import java.time.LocalDateTime;

public class ErrorResponse {
    private Integer status;
    private String message;
    private String path;
    private LocalDateTime timestamp;

    public ErrorResponse(){}

    public String getPath() {
        return path;
    }

    public ErrorResponse setPath(String path) {
        this.path = path;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public ErrorResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public ErrorResponse setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
