package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Các trường null không được trả về kết quả để giảm tải dung lượng
public class UserDTO {
    private Long userId;
    @NotBlank(message = "Họ không được để trống!")
    @Size(max = 50, message = "Họ không được phép vượt quá 50 ký tự!")
    private String fisrtName;
    @NotBlank(message = "Tên không được để trống!")
    @Size(max = 50, message = "Tên không được phép vượt quá 50 ký tự!")
    private String lastName;
    @NotBlank(message = "Username không được bỏ trống!")
    @Min(value = 12, message = "Tài khoản tối thiểu là 12 ký tự!")
    private String username;
    @Min(value = 12, message = "Tài khoản tối thiểu là 12 ký tự!")
    @NotBlank(message = "Mật khẩu không được bỏ trống!")
    private String password;
    @Size(max = 400, message = "Địa chỉ không được phép vượt quá 400 ký tự!")
    private String address;
    private LocalDate createAt;
    private LocalDate updateAt;
}
