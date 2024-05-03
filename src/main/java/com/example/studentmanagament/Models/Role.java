package com.example.studentmanagament.Models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Role {
    ADMINISTRATORS("Ban giám hiệu"),
    STAFF_EDUCATIONAL("Nhân viên giáo vụ"),
    TEACHERS("Giáo viên"),
    USER("Người dùng");
    private final String value;
}
