package edu.sla;

class Cat extends Pet {
    private boolean eatsDryFood;

    Cat(boolean doesEatDryFood, int age, String name) {
        super(age, name);
        eatsDryFood = doesEatDryFood;
    }

    void sayHi() {
        System.out.println("Meow!  My name is " + getName() + ".");
    }

    void describe() {
        System.out.println("I'm a Cat named " + getName() + ".");
        System.out.println("I'm " + getAge() + " human years old.");
        if (eatsDryFood) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
    }
}
