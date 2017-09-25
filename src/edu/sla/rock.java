package edu.sla;

class rock extends Pet {
    private String size;
    private String color;
    private String texture;

    rock(String mySize, String myColor, String myTexture, String myName) {
        super(myName);
        size = mySize;
        color = myColor;
        texture = myTexture;
    }

    void sayHi() {
        System.out.println("Don't take me for granite! My name is " + getName() + ".");
    }

    void describe() {
        System.out.println("I'm a rock named " + getName() + ".");
        System.out.println("I am " + size + ".");
        System.out.println("I am " + texture + " and " + color + ".");
    }
}
