package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Double passingScore;
}
