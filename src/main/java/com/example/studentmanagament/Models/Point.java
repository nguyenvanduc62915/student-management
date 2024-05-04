package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "_points")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Điểm
public class Point extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id")
    private int id;
    @Column(name = "scores")
    @Range(min = 0, max = 10, message = "Điểm thấp nhất là 0 và cao nhất là 10!")
    private Double scores;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", foreignKey = @ForeignKey(name = "FK_point_student"))
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", foreignKey = @ForeignKey(name = "FK_point_subject"))
    private Subject subject;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "semester_id", foreignKey = @ForeignKey(name = "FK_point_semester"))
    private Semester semester;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_year_id", foreignKey = @ForeignKey(name = "FK_point_school_year"))
    private SchoolYear schoolYear;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "grade_id", foreignKey = @ForeignKey(name = "FK_point_grade"))
    private Grade grade;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "point_type_id", foreignKey = @ForeignKey(name = "FK_point_type"))
    private PointType pointType;
}
