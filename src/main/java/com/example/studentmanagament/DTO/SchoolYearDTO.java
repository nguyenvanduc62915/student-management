package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchoolYearDTO {
    private int schoolYearId;
    @Size(max = 4, message = "Tên năm học được phép tối đa 4 ký tự!")
    @NotBlank(message = "Tên năm học không được bỏ trống!")
    private String nameOfSchoolYear;
    private LocalDate createAt;
    private LocalDate updateAt;
}
