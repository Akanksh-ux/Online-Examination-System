package org.example;

public class User {
    private int id;
    private String password;
    private int marks;
    private String firstName;
    private String lastname;

    public User(int id, String password, int marks, String firstName, String lastname) {
        this.id = id;
        this.password = password;
        this.marks = marks;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

