package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

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
    @Size(max = 4, message = "Tên năm học được phép tối đa 4 ký tự!")
    @NotBlank(message = "Tên năm học không được bỏ trống!")
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
    @OneToMany(mappedBy = "schoolYear", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentAllYear> resultStudentAllYears;
    @OneToMany(mappedBy = "schoolYear", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentSubject> resultStudentSubjects;
    @OneToMany(mappedBy = "schoolYear", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultGradeSubject> resultGradeSubjects;
    @OneToMany(mappedBy = "schoolYear", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultGradeSemester> resultGradeSemesters;
}
