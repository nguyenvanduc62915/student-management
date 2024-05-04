package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultStudentAllYearDTO {
    private int resultStudentAllYearId;
    // Điểm trung bình học kỳ 1
    @Range(min = 0, max = 10, message = "Điểm học kỳ 1 thấp nhất là 0 và cao nhất là 10!")
    private Double semesterOneGPA;
    // Điểm trung bình học kỳ 2
    @Range(min = 0, max = 10, message = "Điểm học kỳ 2 thấp nhất là 0 và cao nhất là 10!")
    private Double semesterTwoGPA;
    @Range(min = 0, max = 10, message = "Điểm trung bình cả năm học thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung bình cả năm học
    private Double semesterAllYearGPA;
    private LocalDate createAt;
    private LocalDate updateAt;
}
