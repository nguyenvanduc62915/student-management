package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeacherDTO {
    private int teacherId;
    @Size(max = 100, message = "Họ và tên gió viên không được phép vượt quá 100 ký tự!")
    @NotBlank(message = "Tên giáo viên không được để trống!")
    private String teacherName;
    @Size(max = 400, message = "Địa chỉ không được phép vượt quá 400 ký tự!")
    private String address;
    @Size(min = 10, max = 10, message = "Số điện thoại phải có đúng 10 ký tự!")
    private String phoneNumber;
    @Email(message = "Email không hợp lệ!")
    private String email;
    private LocalDate createAt;
    private LocalDate updateAt;
}
