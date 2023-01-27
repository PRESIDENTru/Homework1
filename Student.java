package com.company;

public class Student {

    private String name;
    private int age;
    private int classNum;

    Student(String name, int age, int classNum) {
        this.age = age;
        this.name = name;
        this.classNum = classNum;
    }

    void addClass() {
        age++;
        classNum++;
        System.out.println("Поздравляем, " + name + ", с переходом в " + classNum + " класс!");
        System.out.println();
    }

    void printClass() {
        System.out.println("Ученик " + name + " учится в " + classNum + " классе");
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 100 && age > 0) {
            this.age = age;
        } else {
            System.out.println("Неккоректный возраст!");
        }
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}