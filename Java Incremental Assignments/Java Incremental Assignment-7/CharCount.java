package assignment7;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static  void main(String args[]){


        try{

            //read data from input file which is the first command line argument
            String s="";
            File fi = new File(args[0]);
            Scanner sc = new Scanner(fi);
            while(sc.hasNext()){
                s+= sc.next();
            }

            System.out.println(s);



            Map<Character,Integer> m = new HashMap<Character, Integer>();
            for(Character i:s.toCharArray())
            {
                m.putIfAbsent(i,1);
                if(m.containsKey(i))
                {
                    m.put(i,m.get(i)+1);
                }
            }

            String f="";
            for(Map.Entry ma:m.entrySet())
                f+= ma.getKey()+ " : "+ma.getValue()+"\n";

            System.out.println(f);



            
            //write data to output file which is the second command line argument
            File newTextFile= new File(args[1]);
            FileWriter fw = new FileWriter(newTextFile);
            fw.write(f);
            fw.close();

        }


        catch(IOException e)
        {
            e.printStackTrace();
        }



    }
}
