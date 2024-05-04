package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

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
    @Size(max = 15, message = "Tên tôn giáo không được phép vượt quá 15 ký tự!")
    @NotBlank(message = "Tên tôn giáo không được bỏ trống!")
    private String religiousName;
    @OneToMany(mappedBy = "religion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Student> students;
}
