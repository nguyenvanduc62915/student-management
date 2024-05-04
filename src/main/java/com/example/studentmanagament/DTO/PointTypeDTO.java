package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PointTypeDTO {
    private int pointTypeId;
    @Range(min = 0, max = 10, message = "Điểm thấp nhất là 0 và cao nhất là 10!")
    private Double scores;
    private LocalDate createAt;
    private LocalDate updateAt;
}
