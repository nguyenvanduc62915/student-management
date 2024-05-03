package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
    private String ethnicName;
    @OneToMany(mappedBy = "nation", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Student> students;
}
