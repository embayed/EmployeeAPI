package net.emb.apiEmployee.model;

import jakarta.persistence.*;
import lombok.Data;

// indicates that the class correspond to a table
@Entity
// manage automatically the Getters and Setters using lombok
@Data
// indicates the table name
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "first_name")
    private String FirstName;

    @Column(name = "last_name")
    private String Lastname;

    @Column(name = "email")
    private String mail;

    @Column(name = "pass")
    private String password;
}
