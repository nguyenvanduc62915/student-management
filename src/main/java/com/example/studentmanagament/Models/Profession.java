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
    @Size(max = 50, message = "Tên nghề nghiệp không đuợc phép vươtj quá 50 ký tự!")
    @NotBlank(message = "Tên nghề nghiệp không được bỏ trống!")
    private String professionName;
    @OneToMany(mappedBy = "fatherIsOccupation", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Student> studentFather;
    @OneToMany(mappedBy = "motherIsOccupation", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Student> studentMother;
}

