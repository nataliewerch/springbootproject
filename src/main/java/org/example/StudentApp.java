package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factory-demo.xml");

        System.out.println();
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        Student studentWithSetter = (Student) context.getBean("student");
        studentWithSetter.setName("Anna");
        studentWithSetter.setAge(29);
        System.out.println("Student with setter: " + studentWithSetter.getName() + " " + studentWithSetter.getAge());

        Student studentWithConstructor = (Student) context.getBean("constructorStudent");
        System.out.println("Student with constructor: " + studentWithConstructor.getName() + " " + studentWithConstructor.getAge());

        context.close();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example");

        StudentWithComponent studentWithComponent = applicationContext.getBean(StudentWithComponent.class);
        studentWithComponent.setName("Inna");
        studentWithComponent.setAge(34);
        System.out.println(studentWithComponent);

        applicationContext.close();
    }
}