package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "_students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private Sex sex;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "address")
    private String address;
    @Column(name = "father_is_full_name")
    private String fatherIsFullName;
    @Column(name = "mother_id_fullName")
    private String motherIsFullName;
    @Column(name = "email")
    private String email;
}
