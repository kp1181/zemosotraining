package krishnaprasad.assignment.data;

public class Test1 {
    int globalA;
    char globalB;
    /*
        the above two variables are class variables so they are initialized to default values
     */

    public void globalPrint()
    {
        System.out.println(globalA);
        System.out.println(globalB);
    }

    public void localPrint()
    {
        int localA;
        char localB;

        /*
        Local variables won't have default values so, they through a compilation error
         */

        System.out.println(localA);
        System.out.println(localB);
    }
}
