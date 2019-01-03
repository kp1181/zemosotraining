package krishnaprasad.assignment.main;

import krishnaprasad.assignment.data.Test1;
import krishnaprasad.assignment.singleton.Test2;

public class Test3 {
    public static void main(String args[])
    {
        Test1 a = new Test1();
        a.localPrint();
        a.globalPrint();


        Test2 b = Test2.ini("Hello");
        b.print();

    }
}
