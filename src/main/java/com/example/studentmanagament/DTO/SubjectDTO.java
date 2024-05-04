package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubjectDTO {
    private int subjectId;
    @Size(max = 50, message = "Tên môn học không được phép vượt quá 50 ký tự!")
    @NotBlank(message = "Tên môn không được để trống!")
    private String subjectName;
    // Số tiết
    @Size(min = 0, message = "Số tiết học phải lớn hơn hoặc bằng 0!")
    private String numberOfPriods;
    private LocalDate createAt;
    private LocalDate updateAt;
}
