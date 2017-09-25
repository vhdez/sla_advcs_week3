package edu.sla;

class Pony extends Pet {
    private boolean eatsFriendship;

    Pony(boolean doesEatFriendship, int age, String name) {
        super(age, name);
        eatsFriendship = doesEatFriendship;
    }

    void sayHi() {System.out.println("Uh, hello (pony noises) my name is " + getName() + ".");}

    void describe() {
        System.out.println("Im a pony named " + getName() + "!");
        System.out.println("I am " + getAge() + ".");
        if (eatsFriendship) {
            System.out.println("I eat plenty of Friendship!");
        } else {
            System.out.println("I'm allergic to Friendship...");
        }
    }
}
