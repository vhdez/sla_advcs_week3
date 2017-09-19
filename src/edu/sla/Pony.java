package edu.sla;

public class Pony {
    int age;
    String name;
    boolean eatsFriendship;

    void sayHi() {System.out.println("Uh, hello (pony noises) my name is " + name + ".");}

    int getAge() {return age;}

    void describe() {
        System.out.println("Im a pony named " + name + "!");
        System.out.println("I am " + age + ".");
        if (eatsFriendship) {
            System.out.println("I eat plenty of Friendship!");
        } else {
            System.out.println("I'm allergic to Friendship...");
        }
    }
}
