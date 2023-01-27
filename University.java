package com.company;

public class University {

    public static void main(String[] args) {

        Teacher teacherGerald = new Teacher("Геральд", 38, "Математика");
        Teacher teacherNikita = new Teacher("Никита", 27, "История");
        Teacher teacherVova = new Teacher("Генадий", 65, "Физика");

        teacherGerald.printStudents();
        teacherGerald.classAddYear();

        teacherNikita.printStudents();

        teacherVova.printStudents();
    }
}
