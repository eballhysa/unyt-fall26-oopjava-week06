package com.eltonb;

public class Student {
    private String name;
    private String surname;
    private String department;
    private double gpa;
    private int credits;

    public Student(String name, String surname, String department, double gpa, int credits) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.gpa = gpa;
        this.credits = credits;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
