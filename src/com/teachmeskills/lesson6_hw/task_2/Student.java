package com.teachmeskills.lesson6_hw.task_2;

/**
 * Student class
 * <p>
 * Runner class
 * Creates the fields, first name, last name, passport number, group number, age.
 * <p>
 * Create a constructor student with field parameters
 */
public class Student {
    String name, surname, passportNumber, groupName;
    byte age;

    public Student(String name, String surname, String passportNumber, String groupName, byte age) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
        this.age = age;
    }
}
