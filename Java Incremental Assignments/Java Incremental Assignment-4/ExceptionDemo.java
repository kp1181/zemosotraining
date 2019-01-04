package assignment4;

import java.util.Scanner;

class ExceptionA extends Exception{ }
class ExceptionB extends Exception{ }
class ExceptionC extends Exception{ }


public class ExceptionDemo{

    void test(int x) throws ExceptionA,ExceptionB,ExceptionC{
        if(x==0)
            throw new NullPointerException();
        else if(x>0 && x<100)
            throw new ExceptionA();
        else if(x>100 && x<1000)
            throw new ExceptionB();
        else
            throw new ExceptionC();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ExceptionDemo e = new ExceptionDemo();
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        try
        {
            e.test(a);
        }
        catch(ExceptionA|ExceptionB|ExceptionC ex)
        {
            System.out.println(ex);
        }
        finally
        {
            System.out.println("In finally");
        }
    }
}
