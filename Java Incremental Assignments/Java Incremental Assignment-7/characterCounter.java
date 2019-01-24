package assignment7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class characterCounter {
    public static void main(String args[]){
        try{
            String fileData="";
            //read data from input file which is the first command line argument
            File inputFile = new File(args[0]);
            Scanner sc = new Scanner(inputFile);
            while(sc.hasNext()){
                fileData+= sc.next();
            }
            System.out.println("data in file:\n"+fileData);

            Map<Character,Integer> countingMap = new HashMap<Character, Integer>();
            for(Character character:fileData.toCharArray())
            {
                countingMap.putIfAbsent(character,1);
                if(countingMap.containsKey(character))
                {
                    countingMap.put(character,countingMap.get(character)+1);
                }
            }

            String result="";
            for(Map.Entry ma:countingMap.entrySet())
                result+= ma.getKey()+ " : "+ma.getValue()+"\n";
            System.out.println(result);

            //write data to output file which is the second command line argument
            File outputFile= new File(args[1]);
            FileWriter fw = new FileWriter(outputFile);
            fw.write(result);
            fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
