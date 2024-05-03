package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_subjects")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Môn học
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject")
    private int id;
    // Tên môn học
    @Column(name = "subject_name")
    private String subjectName;
    // Số tiết
    @Column(name = "number_of_priods")
    private String numberOfPriods;
}
