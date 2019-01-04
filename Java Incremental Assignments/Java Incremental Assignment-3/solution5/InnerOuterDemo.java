package assignment3.solution5;

class Outer1{

    class Inner1{
        Inner1(String s)
        {
            System.out.println("The string is "+s);
        }
    }
}


class InnerOuterDemo{


    static class Inner2 extends Outer1.Inner1{
        Inner2(String s)
        {
            new Outer1().super(s);
        }
    }

    public static void main(String args[])
    {
        Inner2 i2 = new Inner2("Hello");
    }


}
