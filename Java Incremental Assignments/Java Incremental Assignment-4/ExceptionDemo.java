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
        int testingNumber = sc.nextInt();

        try
        {
            e.test(testingNumber);
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

/*
Test cases:

1)0
Exception in thread "main" java.lang.NullPointerException
	at assignment4.ExceptionDemo.test(ExceptionDemo.java:14)
	at assignment4.ExceptionDemo.main(ExceptionDemo.java:32)
In finally

2)21
assignment4.ExceptionA
In finally

3)Enter a number:
888
assignment4.ExceptionB
In finally

4)Enter a number:
4651274
assignment4.ExceptionC
In finally

5)
Enter a number:
-5454
assignment4.ExceptionC
In finally

 */