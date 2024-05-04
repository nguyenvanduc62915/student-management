package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GradeDTO {
    private int id;
    // Tên lớp
    @Size(max = 15, message = "Tên lớp không được phép vượt quá 15 ký tự!")
    @NotBlank(message = "Tên lớp không được bỏ trống!")
    private String gradeName;
    // Sĩ số
    @Range(min = 1, max = 50, message = "Sĩ số lớp có ít nhất 1 học sinh và nhiều nhất là 50 học sinh!")
    @NotBlank(message = "Sĩ số không được bỏ trống!")
    private int number;
    private LocalDate createAt;
    private LocalDate updateAt;
}
