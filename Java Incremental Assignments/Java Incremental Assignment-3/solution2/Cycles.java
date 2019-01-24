package assignment3.solution2;


class Cycle{

}

class Unicycle extends Cycle{
    void balance(){
        System.out.println("Unicycle is balancing");
    }
}

class Bicycle extends Cycle{
    void balance(){
        System.out.println("Bicycle is balancing");
    }
}


class Tricycle extends Cycle{

}



public class Cycles {
    public static void main(String args[])
    {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();

        Cycle cycles[] = {uni,bi,tri};

        for(Cycle c :cycles){
            //this raises a compilation error as Cycle class has no balance method
            //c.balance();
        }

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();

        //this raises a compilation error as Tricycle class has no balance method
        //((Tricycle)arr[2]).balance();


    }


}
