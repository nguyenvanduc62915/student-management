package com.example.studentmanagament.DTO;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SemesterDTO {
    private int semesterId;
    @Size(max = 15, message = "Tên học kỳ được phép tối đa 15 ký tự!")
    @NotBlank(message = "Tên học kỳ không được bỏ trống!")
    private String semesterName;
    // Hệ số
    @Min(value = 0, message = "Hệ số phải lớn hơn hoặc bằng không!")
    private String coefficient;
    private LocalDate createAt;
    private LocalDate updateAt;
}
