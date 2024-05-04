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
@Table(name = "_point_types")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Loại điểm
public class PointType extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_type_id")
    private int id;
    @Column(name = "point_type_name")
    @Size(max = 15, message = "Tên loại điểm không được phép vượt quá 15 ký tự!")
    @NotBlank(message = "Tên loại điểm không được bỏ trống!")
    private String pointTypeName;
    // Hệ số
    @Column(name = "coefficient")
    @OneToMany(mappedBy = "pointType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Point> points;
}
