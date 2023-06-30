package org.example;

import org.springframework.stereotype.Component;

@Component
public class StudentWithComponent {

    private String name;
    private int age;

    public StudentWithComponent() {
    }

    public StudentWithComponent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentWithComponent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
