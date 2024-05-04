package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.util.Set;

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
    @Min(value = 0, message = "Điểm thấp nhất là 0!")
    @NotBlank(message = "Điểm tối thiểu không được bỏ trống!")
    private Double minimumScore;
    // Điểm tối đa
    @Column(name = "maximum_score")
    @Min(value = 0, message = "Điểm cao nhất là 10!")
    @NotBlank(message = "Điểm tối đa không được bỏ trống!")
    private Double maximum_score;
    // Môn học không dưới
    @Column(name = "subject_not_below")
    @Range(min = 0, max = 10, message = "Điểm thấp nhất là 0 và cao nhất là 10!")
    @NotBlank(message = "Ngưỡng điểm không được bỏ trống!")
    private Double subjectNotBelow;
    @OneToMany(mappedBy = "academicAbility", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentAllYear> resultStudentAllYears;
}
