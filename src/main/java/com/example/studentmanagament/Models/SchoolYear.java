package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

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
    @OneToMany(mappedBy = "schoolYear", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Grade> grades;
    @OneToMany(mappedBy = "schoolYear", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Layering> layerings;
    @OneToMany(mappedBy = "schoolYear", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Allot> allots;
    @OneToMany(mappedBy = "schoolYear", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Point> points;
}
