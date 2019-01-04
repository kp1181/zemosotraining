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

        Cycle a = uni.getUnicycle();
        Cycle b = bi.getBicycle();
        Cycle c = tri.getTricycle();
        Cycle d = uni.getUnicycle();

        a.balance();
        b.balance();
        c.balance();
        d.balance();


    }
}
