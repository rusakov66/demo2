package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

import java.util.UUID;

//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class UserModel {

//    @Getter
//    @Setter
    @Id
    @Column
    @GeneratedValue
    private UUID id;
//    @Getter
//    @Setter
    @NotEmpty
    @Column
    private String name;
//    @Getter
//    @Setter
    @NotEmpty
    @Column
    private String position;
//    @Getter
//    @Setter
    @NotNull
    @Column
    private int age;

    public UserModel(UUID id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public UserModel() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
