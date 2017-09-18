package edu.sla;

public class Cat {
    int age;
    String name;
    boolean eatsDryFood;

    void sayHi() {
        System.out.println("Meow!  My name is " + name + ".");
    }

    int getAge() {
        return age;
    }

    void describe() {
        System.out.println("I'm a Cat named " + name + ".");
        System.out.println("I'm " + age + " human years old.");
        if (eatsDryFood) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
    }
}
