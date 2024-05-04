package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "_semesters")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Học kỳ
public class Semester extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester_id")
    private int id;
    // Tên học kỳ
    @Column(name = "semester_name")
    @Size(max = 15, message = "Tên học kỳ được phép tối đa 15 ký tự!")
    @NotBlank(message = "Tên học kỳ không được bỏ trống!")
    private String semesterName;
    // Hệ số
    @Min(value = 0, message = "Hệ số phải lớn hơn hoặc bằng không!")
    @Column(name = "coefficient")
    private String coefficient;
    @OneToMany(mappedBy = "semester", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Point> points;
    @OneToMany(mappedBy = "semester", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentSubject> resultStudentSubjects;
    @OneToMany(mappedBy = "semester", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultGradeSubject> resultGradeSubjects;
    @OneToMany(mappedBy = "semester", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultGradeSemester> resultGradeSemesters;
}

