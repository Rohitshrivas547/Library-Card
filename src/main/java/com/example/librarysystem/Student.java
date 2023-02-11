package com.example.librarysystem;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class Student {
    @Id
    // for increment of primary ley
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int s_id;
    private String name;
    private int age;


    @CreatedDate
    private Date creationDate;

    @UpdateTimestamp
    private Date updationDate;

    public Student(){
    }

    public Student(int s_id, String name, int age) {
        this.s_id = s_id;
        this.name = name;
        this.age = age;
    }
    @OneToOne
    @JoinColumn
    private LibCard card;

    public LibCard getCard() {
        return card;
    }

    public void setCard(LibCard card) {
        this.card = card;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Date updationDate) {
        this.updationDate = updationDate;
    }
}
