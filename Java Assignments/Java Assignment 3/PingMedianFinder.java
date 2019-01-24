package assignmentn3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PingMedianFinder {


    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the host: ");
        String host = scan.next();
        System.out.println("Enter number of packets to be sent: ");
        try{
            int numberOfPackets = scan.nextInt();
            PingMedianFinder finder = new PingMedianFinder();
            finder.ping(host, numberOfPackets);
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid number of packets!");
        }

    }

    void ping(String host, int numberOfPackets)
    {
        String pingCommand = "ping -c "+numberOfPackets+" "+host;
        ArrayList<Double> roundTripTimes = new ArrayList<>(numberOfPackets);
        try
        {
            Process pingProcess = Runtime.getRuntime().exec(pingCommand);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(pingProcess.getInputStream()));

            int count=0;
            String outputLine = "";
            while ((outputLine = inputStream.readLine()) != null) {
                int endIndex = (outputLine.lastIndexOf("ms"))-1;
                if(endIndex!=-2 && count<numberOfPackets)
                {
                    int startIndex = (outputLine.lastIndexOf("="))+1;
                    String time = outputLine.substring(startIndex,endIndex);
                    roundTripTimes.add(Double.valueOf(time));
                    count++;
                }

            }

            double median = median(roundTripTimes);
            if(median!=0)
                System.out.println(median);
            else
                System.out.println("Invalid host");
        }
        catch (IOException e)
        {
            System.out.println("Wasn't able execute ping command properly!");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Host did not reply!");
        }
    }

    double median(ArrayList times)
    {
        Collections.sort(times);
        double median;
        if(times.size()==0){
            return 0;
        }
        if(times.size()%2==0)
        {
            median = ((Double)times.get(times.size()/2) + (Double)times.get(times.size()/2 - 1))/2;
        }
        else
        {
            median = (Double)times.get(times.size()/2);
        }
        return median;
    }
}

/*
Test cases:

1)Enter the host:
www.google.com
Enter number of packets to be sent:
3
46.7


2)Enter the host:
www.kugrgv.com
Enter number of packets to be sent:
4
Invalid host


3)Enter the host:
12.12.12.133
Enter number of packets to be sent:
3
Host did not reply!

4)Enter the host:
www.google.com
Enter number of packets to be sent:
hiii
Invalid number of packets!

5)Enter the host:
31.13.79.35
Enter number of packets to be sent:
6
186.5


 */