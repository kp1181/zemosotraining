package assignmentn4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Dates {


    static void findRange(String a, String b){

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        try{
            Date signup = sdf.parse(a);
            Date current = sdf.parse(b);
            if(signup.after(current)){
                System.out.println("No range");
            }
            else{

                Calendar calSignup = Calendar.getInstance();
                calSignup.setTime(signup);


                Calendar calCurrent = Calendar.getInstance();
                calCurrent.setTime(current);



                int years = calCurrent.get(Calendar.YEAR) - calSignup.get(Calendar.YEAR);
                calSignup.add(Calendar.YEAR, years);
                calSignup.add(Calendar.DAY_OF_MONTH, -30);

                System.out.print(sdf.format(calSignup.getTime()) + " ");

                calSignup.add(Calendar.DAY_OF_MONTH, 60);

                if(calSignup.before(calCurrent)){
                    System.out.println(sdf.format(calSignup.getTime()));
                }
                else{
                    System.out.println(sdf.format(calCurrent.getTime()));
                }

            }

        }
        catch(Exception e){
            e.printStackTrace();
        }



    }


    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String dates[][] = new String[n][2];


        for(int i=0;i<n;i++){
            String signup = sc.next();
            String currentDate = sc.next();
            dates[i][0] = signup;
            dates[i][1] = currentDate;
        }


        for(int i=0;i<n;i++){
            try {
                    findRange(dates[i][0], dates[i][1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

}

