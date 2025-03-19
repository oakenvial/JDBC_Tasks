package org.example.jdbc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CUSTOMERS", schema = "MY_NEW_APP")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", length = 100)
    private String name;

    @Column(name = "SURNAME", length = 100)
    private String surname;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "PHONE_NUMBER", length = 50)
    private String phoneNumber;

    // Default constructor
    public Customer() {}

    // Convenience constructor
    public Customer(String name, String surname, Integer age, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}