package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "_result_student_all_years")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultStudentAllYear extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_student_all_year_id")
    private int id;
    @Column(name = "semester_one_GPA")
    // Điểm trung bình học kỳ 1
    @Range(min = 0, max = 10, message = "Điểm học kỳ 1 thấp nhất là 0 và cao nhất là 10!")
    private Double semesterOneGPA;
    @Column(name = "semester_two_GPA")
    // Điểm trung bình học kỳ 2
    @Range(min = 0, max = 10, message = "Điểm học kỳ 2 thấp nhất là 0 và cao nhất là 10!")
    private Double semesterTwoGPA;
    @Column(name = "semester_all_year_GPA")
    @Range(min = 0, max = 10, message = "Điểm trung bình cả năm học thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung bình cả năm học
    private Double semesterAllYearGPA;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", foreignKey = @ForeignKey(name = "FK_resultstudentallyear_student"))
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "grade_id", foreignKey = @ForeignKey(name = "FK_resultstudentallyear_grade"))
    private Grade grade;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_year_id", foreignKey = @ForeignKey(name = "FK_resultstudentallyear_schoolyear"))
    private SchoolYear schoolYear;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "conduct_id", foreignKey = @ForeignKey(name = "FK_resultstudentallyear_conduct"))
    private Conduct conduct;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "academic_ability_id", foreignKey = @ForeignKey(name = "FK_resultstudentallyear_academicability"))
    private AcademicAbility academicAbility;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id", foreignKey = @ForeignKey(name = "FK_resultstudentallyear_result"))
    private Result result;
}
