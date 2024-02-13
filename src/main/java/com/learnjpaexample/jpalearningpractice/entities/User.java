package com.learnjpaexample.jpalearningpractice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "users") // This is used to map the table name in the database
public class User {

    @Id // This is used to map the primary key in the database
    private long id;
    @Column(name = "user_name") // This is used to map the column name in the database
    private String userName;
    private String password;

    public User() {
        super();
    }

    public User(long id, String userName, String password) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
