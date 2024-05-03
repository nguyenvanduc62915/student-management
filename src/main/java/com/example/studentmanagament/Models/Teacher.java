package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "_teachers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private int id;
    @Column(name = "teacher_name")
    private String teacherName;
    @Column(name = "address")
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Subject subject;
}
