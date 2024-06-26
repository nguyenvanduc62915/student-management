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
@Table(name = "_results")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Kết quả
public class Result extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private int id;
    @Size(max = 15, message = "Tên kết quả không được phép vượt 15 ký tự!")
    @Column(name = "result_name")
    @NotBlank(message = "Tên kết quả không được bỏ trống!")
    private String resultName;
    @OneToMany(mappedBy = "result", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentAllYear> resultStudentAllYears;
}
