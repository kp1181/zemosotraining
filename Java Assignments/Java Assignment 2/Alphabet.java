package assignmentn2;

import java.util.Scanner;

public class Alphabet {


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be checked:");
        String s = sc.next();
        Alphabet a = new Alphabet();

        if(a.isAlphabet(s))
            System.out.println("Contains all the letters");
        else
            System.out.println("Does not contain all the letters");
    }



    //time complexity is O(n)
    //space complexity is O(1)
    boolean isAlphabet(String s)
    {
        String n = s.toLowerCase();

        for(char c='a';c<='z';c++)
        {
            if(!n.contains(String.valueOf(c)))
            {
                return false;
            }
        }
        return true;
    }
}
