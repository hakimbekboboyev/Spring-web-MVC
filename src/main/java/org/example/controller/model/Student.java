package org.example.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private int id;
    private String fullName;
    private int age;
    private String phoneNumber;

    public Student(String fullName, int age, String phoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}
