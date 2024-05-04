package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcademicAbilityDTO  {
    private int academicAbilityId;
    // Điểm tối thiểu
    @Min(value = 0, message = "Điểm thấp nhất là 0!")
    @NotBlank(message = "Điểm tối thiểu không được bỏ trống!")
    private Double minimumScore;
    // Điểm tối đa
    @Min(value = 0, message = "Điểm cao nhất là 10!")
    @NotBlank(message = "Điểm tối đa không được bỏ trống!")
    private Double maximumScore;
    // Môn học không dưới
    @Range(min = 0, max = 10, message = "Điểm thấp nhất là 0 và cao nhất là 10!")
    @NotBlank(message = "Ngưỡng điểm không được bỏ trống!")
    private Double subjectNotBelow;
    private LocalDate createAt;
    private LocalDate updateAt;
}
