package com.example.registration;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private Date dateOfBirth;

    // Constructor to initialize a User object with first name, last name, username,
    // and date of birth
    public User(String firstName, String lastName, String username, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter method to retrieve the first name of the user
    public String getFirstName() {
        return firstName;
    }

    // Getter method to retrieve the last name of the user
    public String getLastName() {
        return lastName;
    }

    // Getter method to retrieve the username of the user
    public String getUsername() {
        return username;
    }

    // Getter method to retrieve the date of birth of the user
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Override toString() method to provide a string representation of the User
    // object
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
