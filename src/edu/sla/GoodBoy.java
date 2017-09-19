package edu.sla;

public class GoodBoy {
    String name;
    boolean speaks;

    void sayHi() {
        if(speaks) System.out.println("Greetings, I am " + name + ".");
        else System.out.println("*it's name is " + name + "*");
    }

    void giveAdvice() {
        if(speaks) System.out.println(name + ": Don't eat glue.");
        else System.out.println("*" + name + " grunts in a seemingly helpful way. you feel inspired*");
    }
}
