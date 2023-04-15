package ru.kata.spring.boot_security.demo.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    @NotEmpty(message = "*Name should not be empty")
    private String name;
    @Column(name = "age")
    @Min(value = 0, message = "*Age is incorrect")
    private int age;
    @Column(name = "email")
    @NotEmpty(message = "*Email should not be empty")
    @Email(message = "*Enter correctly email (example@examp.org)")
    private String email;


    public User() {
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "========================\n" +
                "\t\tКлиент " +
                "#" + id +
                "\nИмя: " + name +
                ";\nВозраст: " + age +
                ";\nemail: '" + email + '\'' +
                "\n========================";
    }
}
