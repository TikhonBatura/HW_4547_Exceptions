package exceptions;

import java.util.Date;

public class CheckBirthdayExceptions extends RuntimeException {
    String Birthday;
String errorText = "You have input incorrect date";
    public CheckBirthdayExceptions (String Birthday){
        String [] temp = Birthday.split(".");
        if (temp.length != 3){
            System.out.println(errorText + Birthday);
        }
            int date = Integer.parseInt(temp[0]);
            int month = Integer.parseInt(temp[1]);
            int year = Integer.parseInt(temp[2]);

        if ( (date < 1 || date > 31) || (month < 1 || month > 12) || (year < 1 || year > 2023) ){
            System.out.println(errorText + Birthday);
        }
        this.Birthday = Birthday;
    }
}
