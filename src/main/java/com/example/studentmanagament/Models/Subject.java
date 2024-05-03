package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "_subjects")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Môn học
public class Subject extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject")
    private int id;
    // Tên môn học
    @Column(name = "subject_name")
    private String subjectName;
    // Số tiết
    @Column(name = "number_of_priods")
    private String numberOfPriods;
    @OneToMany(mappedBy = "subject",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", foreignKey = @ForeignKey(name = "FK_subject_teacher"))
    @JsonIgnore
    private Set<Teacher> teachers;
}
