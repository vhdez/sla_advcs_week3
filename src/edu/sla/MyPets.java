package edu.sla;

public class MyPets {

    public static void main(String[] args) {
        System.out.println("All pets must now be subclasses of Pet.");

        System.out.println("Mr. Hernandez wuz here.");
        System.out.println("Meow! Why do I exist? End my misery! -Sam");
        System.out.println("stonk is better than all of these pets -Eleanor");
        System.out.println("You got no jams-Alex");
        System.out.println("I will eat your knees\nVery\nVery\nSlowly -CJ");
        // I have 3 pets.
        Pony flutter = new Pony(false, 18,"FlutterShy");

        // The 1st pet is a dog named Rufus.
        Dog rufus = new Dog(false,3, "Rufus");

        // The 2nd pet is an older dog named Tully.
        Dog tully = new Dog(true,5,"Tully");

        // The 3rd pet is cat named Ralph.
        Cat ralph = new Cat(false,15, "Ralph");

        //CJ's cat
        Cat oreo = new Cat(true,3, "Oreo");

        //CJ's GoodBoy1
        GoodBoy stonk = new GoodBoy(true,"Stonk");

        //CJ's GoodBoy2
        GoodBoy tarusk = new GoodBoy(false,"Tarusk");

        //Eleanor's 1st pet
        Cat lola = new Cat(true,7,"Lola");

        //Eleanor's 2nd pet
        Cat jolene = new Cat(true,5,"Jolene");

        //pet rock
        rock veronica = new rock("small","rainbow","smooth","Veronica");

        // Mr. Hernandez's unknown pet
        NamelessPet whoknows = new NamelessPet(95);

        // Tell the pets to say hi.
        System.out.println("SAY HI PETS!");
        rufus.sayHi();
        tully.sayHi();
        ralph.sayHi();
        oreo.sayHi();
        stonk.sayHi();
        tarusk.sayHi();
        lola.sayHi();
        jolene.sayHi();
        veronica.sayHi();
        flutter.sayHi();
        whoknows.sayHi();
        System.out.println();

        // Tell the pets to describe themselves.
        System.out.println("NOW DESCRIBE YOURSELVES:");
        rufus.describe();
        System.out.println();
        tully.describe();
        System.out.println();
        ralph.describe();
        System.out.println();
        oreo.describe();
        System.out.println();
        lola.describe();
        System.out.println();
        jolene.describe();
        System.out.println();
        veronica.describe();
        System.out.println();
        flutter.describe();
        System.out.println();
        whoknows.describe();
        System.out.println();

        System.out.println("ANY ADVICE FOR OUR USER?");
        stonk.giveAdvice();
        tarusk.giveAdvice();

        int totalPetsAge = rufus.getAge() + tully.getAge() + ralph.getAge() + lola.getAge() + jolene.getAge() + flutter.getAge() + whoknows.getAge();
        System.out.println("My pets have lived a total of " + totalPetsAge + " human years.");
    }
}
