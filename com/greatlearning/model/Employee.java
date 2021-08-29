package com.greatlearning.model;

public class Employee {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public Employee(String fn, String ln) {
        this.setFirstName(fn);
        this.setLastName(ln);
    }

}