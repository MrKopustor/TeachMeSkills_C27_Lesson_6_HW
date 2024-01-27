package com.teachmeskills.lesson6_hw.task_2;

/**
 * Runner class
 * <p>
 * creates 3 objects ( student ) with fields, first name, last name, passport number, group number, age.
 * <p>
 * creates an array of students
 * <p>
 * runs a loop to output information about students
 */
public class Runner {
    public static void main(String[] args) {

        Student std1 = new Student("Vova", "Ivanov", "BM4723856", "C27", (byte) 19);
        Student std2 = new Student("Alex", "Bulga", "BM9372653", "C27", (byte) 26);
        Student std3 = new Student("Vika", "Kevlich", "BM9836523", "C27", (byte) 31);

        Student[] students = {std1, std2, std3};

        for (Student student : students) {
            System.out.println(student.name + " " + student.surname + ", Age: " + student.age +
                    ", Number passport: " + student.passportNumber + ", Name group " + student.groupName);
        }
    }
}
