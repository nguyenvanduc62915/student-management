package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultGradeSubjectDTO {
    private int resultGradeSubjectId;
    @Min(value = 0, message = "Số lượng đạt lớn hơn hoặc bằng 0!")
    private int quantityPassed;
    @Range(min = 0, max = 100, message = "Tỉ lệ phải nằm trong khoảng từ 0 đến 100!")
    // Tỉ lệ
    private Double rate;
    private LocalDate createAt;
    private LocalDate updateAt;
}
