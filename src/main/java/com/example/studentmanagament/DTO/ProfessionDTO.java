package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfessionDTO {
    private int professionId;
    @Size(max = 50, message = "Tên nghề nghiệp không đuợc phép vươtj quá 50 ký tự!")
    @NotBlank(message = "Tên nghề nghiệp không được bỏ trống!")
    private String professionName;
    private LocalDate createAt;
    private LocalDate updateAt;
}
