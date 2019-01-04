package assignment5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line = sc.nextLine();


        System.out.println(Pattern.matches("^[A-Z].*\\.$",line));
    }


}
