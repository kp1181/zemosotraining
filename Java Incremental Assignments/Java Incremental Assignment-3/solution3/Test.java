package assignment3.solution3;

interface Interface1{
    void method1();
    void method2();
}

interface Interface2{
    void method3();
    void method4();
}

interface Interface3{
    void method5();
    void method6();
}

interface FinalInterface extends Interface1,Interface2,Interface3{
    void method7();
}

class Concrete1{
    void sleep()
    {
        System.out.println("I am sleeping");
    }
}


public class Test extends Concrete1 implements FinalInterface {

    public void method1()
    {
        System.out.println("In method 1");
    }

    public void method2()
    {
        System.out.println("In method 2");
    }

    public void method3()
    {
        System.out.println("In method 3");
    }

    public void method4()
    {
        System.out.println("In method 4");
    }

    public void method5()
    {
        System.out.println("In method 5");
    }

    public void method6()
    {
        System.out.println("In method 6");
    }

    public void method7()
    {
        System.out.println("In method 7");
    }

    void testMethod1(Interface1 i1)
    {
        i1.method1();
    }

    void testMethod2(Interface2 i2)
    {
        i2.method3();
    }

    void testMethod3(Interface3 i3)
    {
        i3.method5();
    }

    void testMethod4(FinalInterface fi)
    {
        fi.method1();
        fi.method7();
    }

    public static void main(String args[])
    {
        Test obj = new Test();
        obj.testMethod1(obj);
        obj.testMethod2(obj);
        obj.testMethod3(obj);
        obj.testMethod4(obj);

    }
}
