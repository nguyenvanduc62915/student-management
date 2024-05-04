package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "_result_grade_semesters")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultGradeSemester extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_grade_semester_id")
    private int id;
    // Số lượng đạt
    @Column(name = "quantity_passed")
    @Min(value = 0, message = "Số lượng đạt lớn hơn hoặc bằng 0!")
    private int quantityPassed;
    // Tỉ lệ
    @Column(name = "rate")
    @Range(min = 0, max = 100, message = "Tỉ lệ phải nằm trong khoảng từ 0 đến 100!")
    private Double rate;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "grade_id", foreignKey = @ForeignKey(name = "FK_resultgradesemester_grade"))
    private Grade grade;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_year_id", foreignKey = @ForeignKey(name = "FK_resultgradesemester_schoolyear"))
    private SchoolYear schoolYear;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "semester_id", foreignKey = @ForeignKey(name = "FK_resultgradesemester_semester"))
    private Semester semester;
}
