package com.example.springapp.FirstApp;

public class Person {

    private String firstName;
    private String lastName;
    private String personCode;

    public Person(String firstName, String lastName, String personCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCode = personCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personCode='" + personCode + '\'' +
                '}';
    }
}
