package com.mwu.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@Entity
@Table(name = "stu")
@NoArgsConstructor
@AllArgsConstructor
public class Stu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;


    @Version
    @Column(name = "version", nullable = false)
    private Integer version;

}
