package org.example;

public class Student {

    private String firaName;
    private String secondName;
    private int age;


    public Student(String firaName, String secondName, int age) {
        this.firaName = firaName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFiraName() {
        return firaName;
    }

    public void setFiraName(String firaName) {
        this.firaName = firaName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
