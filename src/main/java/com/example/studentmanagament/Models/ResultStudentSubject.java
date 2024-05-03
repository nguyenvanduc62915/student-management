package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    // Điểm trung mình miệng
    private Double oralGPA;
    @Column(name = "minute15_GPA")
    // Điểm trung bình 15 phút
    private Double minute15GPA;
    @Column(name = "minute45_GPA")
    // Điểm trung bình 45 phút
    private Double minute45GPA;
    @Column(name = "semester_GPA")
    // Điểm trung bình cả kỳ
    private Double semesterGPA;
    @Column(name = "exam_scores")
    private Double examScores;
}
