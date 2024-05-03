package com.example.studentmanagament.Models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Sex {
    MALE("Nam"),
    FEMALE("Nữ"),
    OTHER("Khác");
    private final String value;
}
