package edu.sla;

class Pet {
    private int myAge;
    private String myName;

    Pet(int age, String name) {
        myAge = age;
        myName = name;
    }

    Pet(int age) {
        myAge = age;
    }

    Pet(String name) {
        myName = name;
    }

    int getAge() {
        return myAge;
    }

    String getName() {
        return myName;
    }

    void sayHi() {
        if (myName == null) {
            System.out.println("[GENERIC] Hi, what's my name?");
        } else {
            System.out.println("[GENERIC] Hi, my name is " + myName);
        }
    }

    void describe() {
        System.out.println("[GENERIC] Hi, I'm a pet.");
        System.out.println("[GENERIC] I'm " + myAge + " human years old.");
    }
}
