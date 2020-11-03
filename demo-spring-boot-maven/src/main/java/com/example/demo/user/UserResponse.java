package com.example.demo.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class UserResponse {
    private int id;
    private String firstname;
    private int age;

    public UserResponse() {
    }

    public UserResponse(int id, String firstname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse that = (UserResponse) o;
        return id == that.id &&
                age == that.age &&
                Objects.equals(firstname, that.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, age);
    }
}
