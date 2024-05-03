package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_semesters")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Học kỳ
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester_id")
    private int id;
    // Tên học kỳ
    @Column(name = "semester_name")
    private String semesterName;
    // Hệ số
    @Column(name = "coefficient")
    private String coefficient;
}

