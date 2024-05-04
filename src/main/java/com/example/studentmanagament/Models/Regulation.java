package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "_regulations")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Quy định
public class Regulation extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regulation_id")
    private int id;
    // Điểm đạt
    @Column(name = "passing_score")
    @Range(min = 0, max = 10, message = "Điểm thấp nhất là 0 và cao nhất là 10!")
    private Double passingScore;
}
