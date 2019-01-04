package assignment2.solution2;

public class Test {
    String ex;

    Test()
    {
        this("hello");
    }

    Test(String a)
    {
        this.ex = a;
    }

    public static void main(String args[])
    {
        Test obj = new Test();
        System.out.println(obj.ex);
    }
}
