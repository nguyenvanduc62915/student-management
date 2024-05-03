package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

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
    @OneToMany(mappedBy = "fatherIsOccupation", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Student> studentFather;
    @OneToMany(mappedBy = "motherIsOccupation", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Student> studentMother;
}

