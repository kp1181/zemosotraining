package assignment3.solution1;

class Rodent{

    //default constructor for printing a message about the class
    Rodent()
    {
        System.out.println("I am a Rodent");
    }

    //abstarct methods in rodent class
    void eat() {}

    void sleep(){}
}

class Mouse extends Rodent{

    //default constructor for printing a message about the class
    Mouse()
    {
        System.out.println("I am a Mouse");
    }

    void eat()
    {
        System.out.println("Mouse is eating");
    }

    void sleep()
    {
        System.out.println("Mouse is sleeping");
    }
}

class Gerbil extends Rodent{

    //default constructor for printing a message about the class
    Gerbil()
    {
        System.out.println("I am a Gerbil");
    }

    void eat()
    {
        System.out.println("Gerbil is eating");
    }

    void sleep()
    {
        System.out.println("Gerbil is sleeping");
    }

}

class Hamster extends Rodent{

    //default constructor for printing a message about the class
    Hamster()
    {
        System.out.println("I am a Hamster");
    }

    void eat()
    {
        System.out.println("Hamster is eating");
    }

    void sleep()
    {
        System.out.println("Hamster is sleeping");
    }

}


public class RodentHierarchy {

    public static void main(String args[])
    {
        Rodent rodents[] = new Rodent[3];

        //
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        rodents[0].eat();
        rodents[0].sleep();

        rodents[1].eat();
        rodents[1].sleep();

        rodents[2].eat();
        rodents[2].sleep();

    }
}
