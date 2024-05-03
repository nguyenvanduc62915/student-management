package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_conducts")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Hạnh kiểm
public class Conduct extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conduct_id")
    private int id;
    // Tên hạnh kiểm
    @Column(name = "name_of_conduct")
    private String nameOfConduct;
}
