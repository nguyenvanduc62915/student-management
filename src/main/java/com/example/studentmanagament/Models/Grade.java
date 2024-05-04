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
@Table(name = "_grades")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Lóp
public class Grade extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    private int id;
    // Tên lớp
    @Column(name = "grade_name")
    @Size(max = 15, message = "Tên lớp không được phép vượt quá 15 ký tự!")
    @NotBlank(message = "Tên lớp không được bỏ trống!")
    private String gradeName;
    // Sĩ số
    @Column(name = "number")
    @Range(min = 1, max = 50, message = "Sĩ số lớp có ít nhất 1 học sinh và nhiều nhất là 50 học sinh!")
    @NotBlank(message = "Sĩ số không được bỏ trống!")
    private int number;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "block_id", foreignKey = @ForeignKey(name = "FK_grade_block"))
    private Block block;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_year_id", foreignKey = @ForeignKey(name = "FK_grade_school_year"))
    private SchoolYear schoolYear;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", foreignKey = @ForeignKey(name = "FK_grade_teacher"))
    private Teacher teacher;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Layering> layerings;
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Allot> allots;
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Point> points;
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentAllYear> resultStudentAllYears;
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentSubject> resultStudentSubjects;
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultGradeSubject> resultGradeSubjects;
    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultGradeSemester> resultGradeSemesters;
}
