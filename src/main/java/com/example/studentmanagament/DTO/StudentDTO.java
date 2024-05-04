package com.example.studentmanagament.DTO;

import com.example.studentmanagament.Models.Sex;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentDTO {
    private int studentId;
    @NotBlank(message = "Họ không được để trống!")
    @Size(max = 50, message = "Họ không được phép vượt quá 50 ký tự!")
    private String firstName;
    @NotBlank(message = "Tên không được để trống!")
    @Size(max = 50, message = "Tên không được phép vượt quá 50 ký tự!")
    private String lastName;
    private LocalDate dateOfBirth;
    @Size(max = 400, message = "Địa chỉ không được phép vượt quá 400 ký tự!")
    private String address;
    @Size(max = 100, message = "Họ và tên bố không được phép vượt quá 100 ký tự!")
    private String fatherIsFullName;
    @Size(max = 100, message = "Họ và tên mẹ không được phép vượt quá 100 ký tự!")
    private String motherIsFullName;
    @Email(message = "Email không hợp lệ")
    private String email;
    private LocalDate createAt;
    private LocalDate updateAt;
}
