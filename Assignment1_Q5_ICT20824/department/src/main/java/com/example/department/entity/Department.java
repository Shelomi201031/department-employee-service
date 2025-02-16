package com.example.department.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //get method for the name
    @Column(nullable = false)
    private String name;

    //get method for the id
    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}
