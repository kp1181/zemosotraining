package assignmentn2;

import java.util.Scanner;

public class AlphabetChecker {


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be checked:");
        String inputString = sc.next();

        if(isAlphabet(inputString))
            System.out.println("Contains all the letters");
        else
            System.out.println("Does not contain all the letters");
    }



    //time complexity is O(n)
    //space complexity is O(1)
    static boolean isAlphabet(String s)
    {
        String lowerCaseInput = s.toLowerCase();

        for(char c='a';c<='z';c++)
        {
            if(!lowerCaseInput.contains(String.valueOf(c)))
            {
                return false;
            }
        }
        return true;
    }
}

/*
Test cases:

1)Enter the string to be checked:
!@#$%^&*()
Does not contain all the letters

2)Enter the string to be checked:
qwertyuiopasdfghjklzxcvbnm,
Contains all the letters

3)Enter the string to be checked:
QWERTYUIOP[ASDFGHJKLZXCVBNM,
Contains all the letters

4)Enter the string to be checked:
QWERTYUIOP[asdfghjkl;ZXCVBNM,.
Contains all the letters

5)Enter the string to be checked:
1QAZ2WSX3edc4RFV5tgb6YHN7ujm8IK9ol0P;MN
Contains all the letters

 */