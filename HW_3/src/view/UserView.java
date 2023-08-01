package view;

import control.DataSplit;
import control.ParseData;
import exceptions.CheckBirthdayExceptions;
import exceptions.CheckSexException;

import java.util.Arrays;
import java.util.Scanner;

public class UserView {
    public UserView(){
    }
    ParseData parseData = new ParseData();
    public void run() {

        System.out.println("=======Program START========");
        System.out.println();
        System.out.println("Please enter info about user in one line, separated by space: \n");
        System.out.println("1. [Last name First name Surname]");
        System.out.println("2. Date of Birth in format dd.mm.yyyy");
        System.out.println("3. Telephone number (just digits)");
        System.out.println("4. Sex: 'f' - female or 'm' - male");
        System.out.println();
        DataSplit data = new DataSplit();

        boolean flag = false;
        String userSTR = null;
        String [] userArr = new String[0];
        while (!flag) {
            userSTR = userInput("here -> ");
            userArr = data.getData(userSTR);
            String [] userArrTest = new String[]{"Sidorov", "Sidor", "Ivanovich", "24.03.1999", "6446260", "f"};
            if (userArr.length == 6){
                try {
                    parseData.checkUserData(userArr);
                    parseData.checkUserData(userArrTest);
                } catch (CheckSexException e) {
                    System.out.println(e.getMessage());
                } catch (CheckBirthdayExceptions checkBirthdayExceptions){
                    flag = true;
                }
            }
        }

        System.out.println("==============");
        System.out.println(Arrays.toString(userArr));
        System.out.println("userArr.length = " + userArr.length);

    }

    String userInput (String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
