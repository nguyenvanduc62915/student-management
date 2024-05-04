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
    @Size(max = 15, message = "Tên dân tộc không được phép vượt quá 15 ký tự!")
    @NotBlank(message = "Tên dân tộc không được bỏ trống!")
    private String ethnicName;
    @OneToMany(mappedBy = "nation", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Student> students;
}
