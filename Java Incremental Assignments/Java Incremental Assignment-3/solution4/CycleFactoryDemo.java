package assignment3.solution4;

interface Cycle{
    void balance();
}


class Unicycle implements Cycle{

    public void balance(){
        System.out.println("Unicycle is balanced");
    }
}


class Bicycle implements Cycle{

    public void balance(){
        System.out.println("Bicycle is balanced");
    }
}


class Tricycle implements Cycle{

    public void balance(){
        System.out.println("Tricycle is balanced");
    }
}


class UnicycleFactory
{
    public Cycle getUnicycle()
    {
        return new Unicycle();
    }
}

class BicycleFactory
{
    public Cycle getBicycle()
    {
        return new Bicycle();
    }
}

class TricycleFactory
{
    public Cycle getTricycle()
    {
        return new Tricycle();
    }
}


public class CycleFactoryDemo {
    public static void main(String args[])
    {
        UnicycleFactory uni = new UnicycleFactory();
        BicycleFactory bi = new BicycleFactory();
        TricycleFactory tri = new TricycleFactory();

        Cycle c1 = uni.getUnicycle();
        Cycle c2 = bi.getBicycle();
        Cycle c3= tri.getTricycle();
        Cycle c4 = uni.getUnicycle();

        c1.balance();
        c2.balance();
        c3.balance();
        c4.balance();


    }
}
