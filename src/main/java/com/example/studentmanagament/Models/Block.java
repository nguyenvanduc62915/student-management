package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_blocks")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Khối
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "block_id")
    private int id;
    @Column(name = "block_name")
    // Tên khối
    private String blockName;
}
