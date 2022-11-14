package com.company;

public class Grade {
    private double grade;
    private String name;

    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }

    public Grade(double grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
