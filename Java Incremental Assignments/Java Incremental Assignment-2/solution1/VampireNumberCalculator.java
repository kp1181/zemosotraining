package assignment2.solution1;

import java.util.Arrays;
import java.util.TreeSet;

public class VampireNumberCalculator {

    public static void main(String[] args) {

        TreeSet<Long> vampireNumbers = new TreeSet<>();

        for (long currentNumber = 1; vampireNumbers.size() <= 100; currentNumber++) {

            if ((numberLength(currentNumber)%2) != 0) {
                currentNumber = (currentNumber*10)-1;
                continue;
            }

            for(long firstFactor = 2; firstFactor <= Math.sqrt(currentNumber) + 1; firstFactor++)
            {
                if(currentNumber % firstFactor == 0)
                {
                    long secondFactor = currentNumber/firstFactor;
                    if (isVampire(currentNumber,firstFactor,secondFactor) && firstFactor <= secondFactor) {
                        vampireNumbers.add(currentNumber);
                        System.out.println(currentNumber);
                    }
                }
            }
        }
    }

    private static boolean isVampire(long currentNumber, long factor1, long factor2){
        if(Long.toString(factor1).endsWith("0") && Long.toString(factor2).endsWith("0"))
        {
            return false;
        }

        int lengthOfCurrentNumber = numberLength(currentNumber);
        if(numberLength(factor1)!=lengthOfCurrentNumber/2 || numberLength(factor2)!=lengthOfCurrentNumber/2)
        {
            return false;
        }

        char[] originalNumberCharacters = Long.toString(currentNumber).toCharArray();
        char[] vampireNumberCharacters = (Long.toString(factor1)+ Long.toString(factor2)).toCharArray();

        Arrays.sort(originalNumberCharacters);
        Arrays.sort(vampireNumberCharacters);

        if(Arrays.equals(originalNumberCharacters,vampireNumberCharacters))
            return true;
        else
            return false;
    }

    private static int numberLength(long n){
        long absoluteValue = Math.abs(n);
        String s = Long.toString(absoluteValue);
        return s.length();
    }

}
