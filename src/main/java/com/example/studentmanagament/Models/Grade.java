package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_grades")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Lóp
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    private int id;
    // Tên lớp
    @Column(name = "grade_name")
    private String gradeName;
    // Sĩ số
    @Column(name = "number")
    private int number;
}
