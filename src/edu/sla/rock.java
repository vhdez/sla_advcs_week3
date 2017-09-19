package edu.sla;

public class rock {
    String name;
    String size;
    String color;
    String texture;
    void sayHi() {System.out.println("Don't take me for granite! My name is " + name + ".");}
    void describe() {
        System.out.println("I'm a rock named " + name + ".");
        System.out.println("I am " + size + ".");
        System.out.println("I am " + texture + " and " + color + ".");
    }
}
