package assignmentn4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.InputMismatchException;
import java.util.Scanner;


public class KYCDateRangeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int noOfQueries=sc.nextInt();
            for(int i=0 ; i < noOfQueries ;i++) {
                String signUpDateString = sc.next();
                String currentDateString = sc.next();

                DateTimeFormatter givenDateFormat=DateTimeFormatter.ofPattern("dd-MM-uuuu").withResolverStyle(ResolverStyle.STRICT);
                findRange(signUpDateString,currentDateString,givenDateFormat);
            }

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        catch(DateTimeParseException e){
            System.out.println("Invalid date");
        }
    }



    static void findRange(String signUpDateString,String currentDateString,DateTimeFormatter givenDateFormat){


        LocalDate signUpDate = LocalDate.parse(signUpDateString,givenDateFormat);
        LocalDate currentDate = LocalDate.parse(currentDateString,givenDateFormat);

        if(signUpDate.isLeapYear() && !currentDate.isLeapYear()){
            noRange();
            return;
        }

        LocalDate currentAnniversary = LocalDate.of(currentDate.getYear(),signUpDate.getMonth(),signUpDate.getDayOfMonth());
        LocalDate windowStartDate = currentAnniversary.minusDays(30);
        LocalDate windowEndDate = currentAnniversary.plusDays(30);

        if(currentDate.isAfter(windowStartDate)){

            if(currentDate.getYear() <= signUpDate.getYear()){
                noRange();
                return;
            }

            if(currentDate.isAfter(windowStartDate) && currentDate.isBefore(windowEndDate)){
                System.out.println(windowStartDate.format(givenDateFormat) + " " +currentDate.format(givenDateFormat));
            }

            else if(currentDate.isAfter(windowEndDate) && currentDate.isBefore(windowEndDate.plusDays(30))){
                System.out.println(windowStartDate.format(givenDateFormat) + " " +windowEndDate.format(givenDateFormat));
            }

            else{
                noRange();
            }

        }

        //checking for range in previous year anniversary
        else{

            if(currentDate.getYear()-1 <= signUpDate.getYear()){
                noRange();
                return;
            }

            LocalDate previousAnniversary = LocalDate.of(currentDate.getYear()-1,signUpDate.getMonth(),signUpDate.getDayOfMonth());
            windowStartDate = previousAnniversary.minusDays(30);
            windowEndDate = previousAnniversary.plusDays(30);


            if(currentDate.isBefore(windowEndDate))
            {
                System.out.println(windowStartDate.format(givenDateFormat) + " " +currentDate.format(givenDateFormat));
            }

            else if(currentDate.isAfter(windowEndDate) && currentDate.isBefore(windowEndDate.plusDays(30))){
                System.out.println(windowStartDate.format(givenDateFormat) + " " +windowEndDate.format(givenDateFormat));
            }

            else{
                noRange();
            }

        }


    }

    static void noRange()
    {
        System.out.println("No Range");
    }
}