package com.example.studentmanagament.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultStudentSubjectDTO {
    private int resultStudentSubjectId;
    @Range(min = 0, max = 10, message = "Điểm miệng thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung mình miệng
    private Double oralGPA;
    @Range(min = 0, max = 10, message = "Điểm 15 phút thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung bình 15 phút
    private Double minute15GPA;
    @Range(min = 0, max = 10, message = "Điểm 45 phút thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung bình 45 phút
    private Double minute45GPA;
    @Range(min = 0, max = 10, message = "Điểm trung bình năm thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung bình cả kỳ
    private Double semesterGPA;
    // Điểm thi
    @Range(min = 0, max = 10, message = "Điểm thi thấp nhất là 0 và cao nhất là 10!")
    private Double examScores;
    private LocalDate createAt;
    private LocalDate updateAt;
}
