package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_nations")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Dân tộc
public class Nation extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nation_id")
    private int id;
    // Tên dân tộc
    @Column(name = "ethnic_name")
    private String ethnicName;
}
