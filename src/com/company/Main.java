package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Student student = new Student("Maciej");
        Grade grade = new Grade(5,"Matma");
        Grade grade1 = new Grade(3,"CS");
        Grade grade2 = new Grade(4,"MM");
        Grade grade3 = new Grade(2,"A");
        System.out.println(student);
        System.out.println(grade.toString());
        student.addGrade(grade);
        System.out.println(student);
        student.addGrade(grade1);
        System.out.println(student);
        System.out.println(student.getAverageGrade());
        System.out.println(student);
        student.addGrade(grade2);
        System.out.println(student);
        System.out.println(Arrays.toString(student.getGrades()));
        System.out.println(student.getAverageGrade());
        student.addGrade(grade3);
        System.out.println(student.getAverageGrade());
    }
}
