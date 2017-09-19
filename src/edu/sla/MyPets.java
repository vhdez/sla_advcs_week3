package edu.sla;

public class MyPets {

    public static void main(String[] args) {
        System.out.println("Mr. Hernandez wuz here.");
        System.out.println("Meow! Why do I exist? End my misery! -Sam");
        System.out.println("stonk is better than all of these pets -Eleanor");
        System.out.println("You got no jams-Alex");
        System.out.println("I will eat your knees\nVery\nVery\nSlowly -CJ");
        // I have 3 pets.
        // The 1st pet is a dog named Rufus.
        Pony flutter = new Pony();
        flutter.age = 18;
        flutter.name = "FlutterShy";
        flutter.eatsFriendship = false;

        Dog rufus = new Dog();
        rufus.age = 3;
        rufus.name = "Rufus";
        rufus.eatsDryFood = false;

        // The 2nd pet is an older dog named Tully.
        Dog tully = new Dog();
        tully.age = 5;
        tully.name = "Tully";
        tully.eatsDryFood = true;

        // The 2nd pet is an older dog named Tully.
        Cat ralph = new Cat();
        ralph.age = 15;
        ralph.name = "Ralph";
        ralph.eatsDryFood = false;

        Cat oreo = new Cat();
        oreo.age = 3;
        oreo.name = "Oreo";
        oreo.eatsDryFood = true;

        GoodBoy stonk = new GoodBoy();
        stonk.name = "Stonk";
        stonk.speaks = true;

        GoodBoy tarusk = new GoodBoy();
        tarusk.name = "Tarusk";
        tarusk.speaks = false;

        //Eleanor's 1st pet
        Cat lola = new Cat();
        lola.age = 7;
        lola.name = "Lola";
        lola.eatsDryFood = true;

        //Eleanor's 2nd pet
        Cat jolene = new Cat();
        jolene.age = 5;
        jolene.name = "Jolene";
        jolene.eatsDryFood = true;

        //pet rock
        rock veronica = new rock();
        veronica.texture = "smooth";
        veronica.color = "rainbow";
        veronica.name = "Veronica";
        veronica.size = "small";

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

        System.out.println("ANY ADVICE FOR OUR USER?");
        stonk.giveAdvice();
        tarusk.giveAdvice();
        lola.describe();
        System.out.println();
        jolene.describe();
        System.out.println();
        veronica.describe();
        System.out.println();
        flutter.describe();
        System.out.println();


        int totalPetsAge = rufus.getAge() + tully.getAge() + ralph.getAge() + lola.getAge() + jolene.getAge() + flutter.getAge();
        System.out.println("My pets have lived a total of " + totalPetsAge + " human years.");
    }
}
