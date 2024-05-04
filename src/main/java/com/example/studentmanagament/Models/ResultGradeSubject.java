package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.security.web.csrf.CsrfTokenRepository;

@Entity
@Table(name = "_result_grade_subjects")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultGradeSubject extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_grade_subject_id")
    private int id;
    @Column(name = "quantity_passed")
    // Số lượng đạt
    @Min(value = 0, message = "Số lượng đạt lớn hơn hoặc bằng 0!")
    private int quantityPassed;
    @Column(name = "rate")
    @Range(min = 0, max = 100, message = "Tỉ lệ phải nằm trong khoảng từ 0 đến 100!")
    // Tỉ lệ
    private Double rate;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "grade_id", foreignKey = @ForeignKey(name = "FK_resultgradesubject_grade"))
    private Grade grade;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_year_id", foreignKey = @ForeignKey(name = "FK_resultgradesubject_schoolyear"))
    private SchoolYear schoolYear;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", foreignKey = @ForeignKey(name = "FK_resultgradesubject_subject"))
    private Subject subject;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "semester_id", foreignKey = @ForeignKey(name = "FK_resultgradesubject_semester"))
    private Semester semester;
}
