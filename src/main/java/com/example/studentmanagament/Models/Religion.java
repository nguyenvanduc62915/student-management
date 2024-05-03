package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_religions")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Tôn giáo
public class Religion extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "religion_id")
    private int id;
    // Tên tôn giáo
    @Column(name = "religious_name")
    private String religiousName;
}
