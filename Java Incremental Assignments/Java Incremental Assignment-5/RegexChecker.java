package assignment5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexChecker {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line = sc.nextLine();

        //checks if a sentence begins with a capital letter and ends with a period
        System.out.println(Pattern.matches("^[A-Z].*\\.$",line));
    }


}

/*
Test cases:

1)Enter a line:
hey there!
false

2)Enter a line:
Check this sentense. It works.
true

3)Enter a line:
Hello World.
true

4)Enter a line:
hello world.
false

5)Enter a line:
Check this sentence.Hello
false


 */