package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Các trường null không được trả về kết quả để giảm tải dung lượng
@Validated
public class UserDTO {
    private Long id;
    @NotBlank(message = "Họ không được bỏ trống")
    private String fisrtName;
    @NotBlank(message = "Tên không được bỏ trống")
    private String lastName;
    private String username;
    private String password;
    @Size(max = 500, message = "Địa chỉ không được vượt quá 500 ký tự!")
    private String address;
    private LocalDate createAt;
    private LocalDate updateAt;
}
