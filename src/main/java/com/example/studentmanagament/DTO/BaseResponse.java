package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class BaseResponse<T> {
    private T data;
    private String message;
    private int code;
}
