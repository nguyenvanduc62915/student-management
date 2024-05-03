package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_result_grade_semesters")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultGradeSemester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_grade_semester_id")
    private int id;
    @Column(name = "quantity_passed")
    // Số lượng đạt
    private int quantityPassed;
    @Column(name = "rate")
    // Tỉ lệ
    private Double rate;
}
