package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConductDTO {
    private int conductId;
    // Tên hạnh kiểm
    @Size(max = 15, message = "Tên hạnh kiểm không được phép vượt quá 15 ký tự!")
    @NotBlank(message = "Tên hạnh kiểm không được bỏ trống!")
    private String nameOfConduct;
    private LocalDate createAt;
    private LocalDate updateAt;
}
