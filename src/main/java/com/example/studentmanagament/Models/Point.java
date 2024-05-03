package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Double scores;
}
