package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_academic_abilities")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Học lực
public class AcademicAbility extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "academic_ability_id")
    private int id;
    // Điểm tối thiểu
    @Column(name = "minimum_score")
    private Double minimumScore;
    // Điểm tối đa
    @Column(name = "maximum_score")
    private Double maximum_score;
    // Môn học không dưới
    @Column(name = "subject_not_below")
    private Double subjectNotBelow;
}
