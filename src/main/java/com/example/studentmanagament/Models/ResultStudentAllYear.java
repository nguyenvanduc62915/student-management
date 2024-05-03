package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_result_student_all_years")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultStudentAllYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_student_all_year_id")
    private int id;
    @Column(name = "semester_one_GPA")
    // Điểm trung bình học kỳ 1
    private Double semesterOneGPA;
    @Column(name = "semester_two_GPA")
    // Điểm trung bình học kỳ 2
    private Double semesterTwoGPA;
    @Column(name = "semester_all_year_GPA")
    // Điểm trung bình cả năm học
    private Double semesterAllYearGPA;
}
