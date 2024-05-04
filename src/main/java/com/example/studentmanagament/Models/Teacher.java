package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @Size(max = 100, message = "Họ và tên gió viên không được phép vượt quá 100 ký tự!")
    @NotBlank(message = "Tên giáo viên không được để trống!")
    private String teacherName;
    @Column(name = "address")
    @Size(max = 400, message = "Địa chỉ không được phép vượt quá 400 ký tự!")
    private String address;
    @Column(name = "phone_number")
    @Size(min = 10, max = 10, message = "Số điện thoại phải có đúng 10 ký tự!")
    private String phoneNumber;
    @Email(message = "Email không hợp lệ!")
    @Column(name = "email")
    private String email;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", foreignKey = @ForeignKey(name = "FK_teacher_subject"))
    private Subject subject;
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Grade> grades;
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Allot> allots;
}
