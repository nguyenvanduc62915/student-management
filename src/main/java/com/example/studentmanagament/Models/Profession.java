package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_professions")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Nghề nghiệp
public class Profession extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profession_id")
    private int id;
    @Column(name = "profession_name")
    private String professionName;
}

