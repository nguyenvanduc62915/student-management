package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockDTO {
    private int blockId;
    // Tên khối
    @Size(max = 30, message = "Tên khối không được vượt quá 30 ký tự!")
    @NotBlank(message = "Tên khối không được bỏ trống!")
    private String blockName;
    private LocalDate createAt;
    private LocalDate updateAt;
}
