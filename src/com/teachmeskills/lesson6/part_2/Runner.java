package com.teachmeskills.lesson6.part_2;

import com.teachmeskills.lesson6.part_2.model.Student;

/**
 * Создал 3 экземляра класса с данными студента на входе
 * сравнил студентов с помощью метода equals
 */
public class Runner {

    public static void main(String[] args) {

        Student student1 = new Student(
                "Андрей", "Трофимов", "An_15", "Android разработка");
        Student student2 = new Student(
                "Линус", "Торвальдс", "Li_91", "Back-end разработка");
        Student student3 = new Student(
                "Гвидо", "ван Россум", "Py_91", "Python разработка");

        String x = student2.equals(student3)? "Схожие данные" : "Схожих данных нет";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(x);
    }

}