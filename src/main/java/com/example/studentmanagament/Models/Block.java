package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "_blocks")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Khối
public class Block extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "block_id")
    private int id;
    // Tên khối
    @Column(name = "block_name")
    @Size(max = 30, message = "Tên khối không được vượt quá 30 ký tự!")
    @NotBlank(message = "Tên khối không được bỏ trống!")
    private String blockName;
    @OneToMany(mappedBy = "block", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Grade> grades;
    @OneToMany(mappedBy = "block", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Layering> layerings;
}
