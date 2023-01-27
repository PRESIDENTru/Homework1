package com.company;

public class Teacher {

    private String name;
    private int age;
    private String competence;

    private Student[] arrayStudent = new Student[] {
        new Student("Вася", 16, 10),
        new Student("Дмитрий", 14, 8),
        new Student("Пётр", 15, 9)
    };

    Teacher(String name, int age, String competence) {
        this.name = name;
        this.age = age;
        this.competence = competence;
    }

    void printStudents() {
        System.out.println("-----------Ученики------------");
        for (int i = 0; i < arrayStudent.length; i++) {
            Student student = arrayStudent[i];
            System.out.println("Имя: " + student.getName());
            System.out.println("Возвраст: " + student.getAge());
            System.out.println("Класс: " + student.getClassNum());
            System.out.println("Учитель: " + name + " (" + competence + ")");
            System.out.println("------------------------------");
        }
        System.out.println();
    }

    void classAddYear() {
        for (int i = 0; i < arrayStudent.length; i++) {
            Student student = arrayStudent[i];
            student.printClass();
            student.addClass();
        }
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }
}
