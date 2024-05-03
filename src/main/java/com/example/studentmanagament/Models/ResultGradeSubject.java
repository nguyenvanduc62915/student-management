package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.web.csrf.CsrfTokenRepository;

@Entity
@Table(name = "_result_grade_subjects")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultGradeSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_grade_subject_id")
    private int id;
    @Column(name = "quantity_passed")
    // Số lượng đạt
    private int quantityPassed;
    @Column(name = "rate")
    // Tỉ lệ
    private Double rate;
}
