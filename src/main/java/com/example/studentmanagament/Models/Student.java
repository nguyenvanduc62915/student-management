package com.example.studentmanagament.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Properties;
import java.util.Set;

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
    @NotBlank(message = "Họ không được để trống!")
    @Size(max = 50, message = "Họ không được phép vượt quá 50 ký tự!")
    private String firstName;
    @Column(name = "last_name")
    @NotBlank(message = "Tên không được để trống!")
    @Size(max = 50, message = "Tên không được phép vượt quá 50 ký tự!")
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private Sex sex;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "address")
    @Size(max = 400, message = "Địa chỉ không được phép vượt quá 400 ký tự!")
    private String address;
    @Column(name = "father_is_full_name")
    @Size(max = 100, message = "Họ và tên bố không được phép vượt quá 100 ký tự!")
    private String fatherIsFullName;
    @Column(name = "mother_id_fullName")
    @Size(max = 100, message = "Họ và tên mẹ không được phép vượt quá 100 ký tự!")
    private String motherIsFullName;
    @Column(name = "email")
    @Email(message = "Email không hợp lệ")
    private String email;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "nation_id", foreignKey = @ForeignKey(name = "FK_student_nation"))
    private Nation nation;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "religion_id", foreignKey = @ForeignKey(name = "FK_student_relegion"))
    private Religion religion;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "father_is_occupation", foreignKey = @ForeignKey(name = "FK_student_father"))
    private Profession fatherIsOccupation;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "mother_is_occupation", foreignKey = @ForeignKey(name = "FK_student_mother"))
    private Profession motherIsOccupation;
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Layering> layerings;
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Point> points;
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentAllYear> resultStudentAllYears;
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ResultStudentSubject> resultStudentSubjects;
}
