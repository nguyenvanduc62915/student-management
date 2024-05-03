package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_layerings")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Phân lớp
public class Layering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "layering_id")
    private int id;
}
