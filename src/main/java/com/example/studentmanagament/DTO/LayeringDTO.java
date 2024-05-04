package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LayeringDTO {
    private int layeringId;
    private LocalDate createAt;
    private LocalDate updateAt;
}
