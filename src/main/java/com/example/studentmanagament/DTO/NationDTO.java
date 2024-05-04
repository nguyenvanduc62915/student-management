package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NationDTO {
    private int nationId;
    @Size(max = 15, message = "Tên dân tộc không được phép vượt quá 15 ký tự!")
    @NotBlank(message = "Tên dân tộc không được bỏ trống!")
    private String ethnicName;
    private LocalDate createAt;
    private LocalDate updateAt;
}
