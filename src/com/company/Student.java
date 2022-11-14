package com.company;

import java.util.Arrays;

public class Student {
    private String name;
    private int gradesCount;
    private Grade[] grades = new Grade[10];

    public Student(String name) {
        this.name = name;
        this.gradesCount = gradesCount;
        this.grades = grades;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradesCount=" + gradesCount +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Grade[] getGrades() {
        return grades;
    }



    public boolean addGrade(Grade grade){
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == null){
                grades[i] = grade;
            }
            if (grades[i].equals(grade)){
                return true;
            }
        }
        return false;
    }

    public double getAverageGrade(){
        gradesCount=0;
        double sum = 0;
        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i]!= null) {
                sum = sum + grades[i].getGrade();
                gradesCount++;
            }
        }
        average=sum/gradesCount;

        return average;
    }
}
