package edu.sla;

class NamelessPet extends Pet {

    NamelessPet(int myAge) {
        super(myAge);
    }

    void describe() {
        System.out.println("I'm a Pet of unknown type.");
        System.out.println("I'm " + getAge() + " human years old.");
    }

}
