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
        Rodent arr[] = new Rodent[3];

        //
        arr[0] = new Mouse();
        arr[1] = new Gerbil();
        arr[2] = new Hamster();

        arr[0].eat();
        arr[0].sleep();

        arr[1].eat();
        arr[1].sleep();

        arr[2].eat();
        arr[2].sleep();

    }
}
