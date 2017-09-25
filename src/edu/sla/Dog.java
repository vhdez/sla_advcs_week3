package edu.sla;

class Dog extends Pet {
    private boolean eatsDryFood;

    Dog(boolean doesEatDryFood, int age, String name) {
        super(age, name);
        eatsDryFood = doesEatDryFood;
    }

    void sayHi() {
        System.out.println("Woof!  My name is " + getName() + ".");
    }

    void describe() {
        System.out.println("I'm a Dog named " + getName() + ".");
        System.out.println("I'm " + getAge()*7 + " dog years old.");
        if (eatsDryFood) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
    }
}
