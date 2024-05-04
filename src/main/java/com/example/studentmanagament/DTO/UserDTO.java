package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Các trường null không được trả về kết quả để giảm tải dung lượng
public class UserDTO {
    private int userId;
    @Size(max = 100, message = "Họ và tên gió viên không được phép vượt quá 100 ký tự!")
    @NotBlank(message = "Tên giáo viên không được để trống!")
    private String teacherName;
    @Size(max = 400, message = "Địa chỉ không được phép vượt quá 400 ký tự!")
    private String address;
    @Size(min = 10, max = 10, message = "Số điện thoại phải có đúng 10 ký tự!")
    private String phoneNumber;
    private String email;
    private LocalDate createAt;
    private LocalDate updateAt;
}
