package assignment2.solution1;

import java.util.Arrays;
import java.util.HashSet;

public class Vampire{

    public static void main(String[] args) {
        HashSet<Long> vamps = new HashSet<>();
        for (long i = 10; vamps.size() <= 100; i++) {
            if ((numLength(i) % 2) != 0) {
                i = (i*10)-1;
                continue;
            }
            for (long x = 2; x <= Math.sqrt(i) + 1; x++)
            {
                if (i % x == 0)
                {
                    long y = i/x;
                    if (isVampire(i,x,y) && x <= y) {
                        vamps.add(i);
                        System.out.println(i);
                    }
                }
            }
        }
    }

    private static boolean isVampire(long orig, long n1, long n2){
        if(Long.toString(n1).endsWith("0") && Long.toString(n2).endsWith("0")) return false;

        int origLen = numLength(orig);
        if(numLength(n1) != origLen / 2 || numLength(n2) != origLen / 2) return false;

        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(n1) + Long.toString(n2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }

    private static int numLength(long num){
        long a = Math.abs(num);
        String s = Long.toString(a);
        return s.length();
    }

}
