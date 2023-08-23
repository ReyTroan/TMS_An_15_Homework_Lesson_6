package com.teachmeskills.lesson6.part_2.model;


import java.util.Objects;

public class Student {

    public String name;
    public String surname;
    public String groupName;
    public String specialization;

    public Student(String name, String surname, String groupName, String specialization ) {
        this.name = name;
        this.surname = surname;
        this.groupName = groupName;
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(groupName, student.groupName) && Objects.equals(specialization, student.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, groupName, specialization);
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group name='" + groupName + '\'' +
                ", specialization=" + specialization +
                ']';
    }


}
