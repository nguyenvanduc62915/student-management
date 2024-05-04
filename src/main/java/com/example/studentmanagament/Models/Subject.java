package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "_subjects")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Môn học
public class Subject extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject")
    private int id;
    // Tên môn học
    @Column(name = "subject_name")
    @Size(max = 50, message = "Tên môn học không được phép vượt quá 50 ký tự!")
    @NotBlank(message = "Tên môn không được để trống!")
    private String subjectName;
    // Số tiết
    @Column(name = "number_of_priods")
    @Size(min = 0, message = "Số tiết học phải lớn hơn hoặc bằng 0!")
    private String numberOfPriods;
    @OneToMany(mappedBy = "subject",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Teacher> teachers;
    @OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Allot> allots;
    @OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Point> points;
    @OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentSubject> resultStudentSubjects;
    @OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultGradeSubject> resultGradeSubjects;
}
