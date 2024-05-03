package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_school_years")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Năm học
public class SchoolYear extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schools_year_id")
    private int id;
    // Tên năm học
    @Column(name = "name_of_school_year")
    private String nameOfSchoolYear;
}
