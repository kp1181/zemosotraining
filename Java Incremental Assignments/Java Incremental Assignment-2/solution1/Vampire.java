package assignment2.solution1;

import java.util.ArrayList;
/*
A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y
each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y,
 in any order. Write a java program to print first 100 vampire numbers.
 */


public class Vampire {

    static ArrayList b = new ArrayList();
    public static void main(String args[])
    {
        int count=0;

        for(int i=0;count<100;i++)
        {
            if(vampire(i)) {
                System.out.println(i);
            }

        }
    }


    static void permute(char[] charNum,String prefix,int n,int k)
    {

        if(k==0)
        {
            int num = Integer.parseInt(prefix);
            b.add(num);
            return;
        }
        for(int i=0;i<n;i++)
        {
            String newPrefix = prefix + charNum[i];
            permute(charNum,newPrefix,n,k-1);
        }
    }


    static boolean vampire(int num)
    {
        String strNum = String.valueOf(num);
        int n = strNum.length();
        if(n%2!=0 || n==2)
        {
            return false;
        }


        //permutations of length n/2
        int l = n/2;
        ArrayList a = new ArrayList();
        char[] charNum = strNum.toCharArray();

        permute(charNum,"",n,n/2);
        System.out.println("permuting "+ strNum);
        System.out.println(b);

        return true;

    }
}
