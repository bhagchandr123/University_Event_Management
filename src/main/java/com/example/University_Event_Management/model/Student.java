package com.example.University_Event_Management.model;


import com.example.University_Event_Management.Enum.Department;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long studentId;

    String firstName;

    String lastName;

    int age;

    @Enumerated(EnumType.STRING)
    Department department;

}
