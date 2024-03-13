package com.sarademo.apilamatraca.dtos;

import java.time.LocalDateTime;
import java.util.Map;

public class ControllerResponse {

    private Integer status;
    private Map<String, Object> data;
    private LocalDateTime timestamp;

    public ControllerResponse() {
    }

    public ControllerResponse(Integer status, Map<String, Object> data, LocalDateTime timestamp) {
        this.status = status;
        this.data = data;

        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public ControllerResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public ControllerResponse setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public ControllerResponse setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
