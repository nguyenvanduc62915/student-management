package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultDTO {
    private int resultId;
    @Size(max = 15, message = "Tên kết quả không được phép vượt 15 ký tự!")
    @NotBlank(message = "Tên kết quả không được bỏ trống!")
    private String resultName;
    private LocalDate createAt;
    private LocalDate updateAt;
}
