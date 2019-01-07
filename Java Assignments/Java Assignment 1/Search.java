package JavaAssignment1;


import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Search {
    public static void main(String args[])
    {
        Search search = new Search();
        Scanner sc = new Scanner(System.in);

        //for repeatedly taking input from user, using infinite loop
        while(true)
        {
            System.out.println("Enter the regex to match files");
            String reg = sc.next();

            //sending the input regular expression and the home directory path to be searched
            search.find(reg,new File("/home"));
        }

    }

    void find(String reg,File dir)
    {
        //getting the list of file in that directory in to an array
        File[] l =dir.listFiles();

        //if directory is not empty,starts checking
        if(l!=null)
        {

            //for every file in directory
            for (File f:l)
            {
                //if the file in the directory is also a directory file, search in that directory also
                if(f.isDirectory())
                {
                    find(reg,f);
                }

                //if the file name is matched with regular expression,print the path to the file
                //matches method checks the pattern and the file name
                else if(matches(reg,f.getName()))
                {
                    System.out.println(f.getPath());
                }
            }
        }
    }



    //This method checks if filename matches with given pattern or not
    boolean matches(String reg,String name)
    {
        Pattern pattern = Pattern.compile(reg);
        Matcher m = pattern.matcher(name);
        if(m.find())
            return true;
        else
            return false;
    }
}