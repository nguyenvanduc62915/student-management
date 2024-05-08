package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "_result_student_subjects")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultStudentSubject extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_student_subject_id")
    private int id;
    @Column(name = "oral_GPA")
    @Range(min = 0, max = 10, message = "Điểm miệng thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung mình miệng
    private Double oralGPA;
    @Column(name = "minute15_GPA")
    @Range(min = 0, max = 10, message = "Điểm 15 phút thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung bình 15 phút
    private Double minute15GPA;
    @Column(name = "minute45_GPA")
    @Range(min = 0, max = 10, message = "Điểm 45 phút thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung bình 45 phút
    private Double minute45GPA;
    @Column(name = "semester_GPA")
    @Range(min = 0, max = 10, message = "Điểm trung bình năm thấp nhất là 0 và cao nhất là 10!")
    // Điểm trung bình cả kỳ
    private Double semesterGPA;
    // Điểm thi
    @Column(name = "exam_scores")
    @Range(min = 0, max = 10, message = "Điểm thi thấp nhất là 0 và cao nhất là 10!")
    private Double examScores;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", foreignKey = @ForeignKey(name = "FK_resultstudensubject_student"))
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "grade_id", foreignKey = @ForeignKey(name = "FK_resultstudensubject_grade"))
    private Grade grade;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_year_id", foreignKey = @ForeignKey(name = "FK_resultstudensubject_schoolyear"))
    private SchoolYear schoolYear;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", foreignKey = @ForeignKey(name = "FK_resultstudensubject_subject"))
    private Subject subject;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "semester_id", foreignKey = @ForeignKey(name = "FK_resultstudensubject_semester"))
    private Semester semester;
}
