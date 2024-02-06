package com.example.demo.models.entity;

import com.example.demo.models.enums.Gender;
import com.example.demo.models.enums.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_employee")
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "created_date")
    LocalDateTime createdDate;
    @Column(name = "updated_date")
    LocalDateTime updatedDate;
    @Enumerated(EnumType.STRING)
    Status status;
    @Column(name = "name")
    String name;
    @Column(name = "lastname")
    String lastname;
    @Column(name = "middle_name")
    String middleName;
    @Column(name = "birth_date")
    LocalDate birthDate;
    @Column(name = "tin")
    String tin;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Column(name = "phone")
    String phone;
    @Column(name = "email")
    String email;

}
