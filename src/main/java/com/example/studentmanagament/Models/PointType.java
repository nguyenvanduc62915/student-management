package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_point_types")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Loại điểm
public class PointType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_type_id")
    private int id;
    @Column(name = "point_type_name")
    private String pointTypeName;
    // Hệ số
    @Column(name = "coefficient")
    private int coefficient;
}
