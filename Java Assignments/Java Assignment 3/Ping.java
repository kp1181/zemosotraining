package assignmentn3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ping {

    static double median(ArrayList li)
    {
        Collections.sort(li);
        double median;
        if(li.size()%2==0)
        {
           median = ((Double)li.get(li.size()/2) + (Double)li.get(li.size()/2 - 1))/2;
        }
        else
        {
            median = (Double)li.get(li.size()/2);
        }
        return median;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the host: ");
        String host = sc.next();
        System.out.println("Enter the count for ping: ");
        int c = sc.nextInt();
        String cmd = "ping -c "+c+" "+host;
        ArrayList<Double> li = new ArrayList<>(c);
        try
        {
            Process p = Runtime.getRuntime().exec(cmd);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            int count=0;
            String s = "";
            while ((s = inputStream.readLine()) != null) {
                int end = (s.lastIndexOf("ms"))-1;
                if(end!=-2 && count<c)
                {
                    int beg = (s.lastIndexOf("="))+1;
                    String t = s.substring(beg,end);
                    li.add(Double.valueOf(t));
                    count++;
                }

            }

            System.out.println(median(li));


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
