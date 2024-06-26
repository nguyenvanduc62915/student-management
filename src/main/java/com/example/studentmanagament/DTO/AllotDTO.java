package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllotDTO {
    private int allotId;
    private LocalDate createAt;
    private LocalDate updateAt;
}
