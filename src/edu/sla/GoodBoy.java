package edu.sla;
//CJ's class
class GoodBoy extends Pet {
    private boolean speaks;

    GoodBoy(boolean doesSpeak, String name) {
        super(name);
        speaks = doesSpeak;
    }

    void sayHi() {
        if(speaks) System.out.println("Greetings, I am " + getName() + ".");
        else System.out.println("*it's name is " + getName() + "*");
    }

    void giveAdvice() {
        if(speaks) System.out.println(getName() + ": Don't eat glue.");
        else System.out.println("*" + getName() + " grunts in a seemingly helpful way. you feel inspired*");
    }
}
