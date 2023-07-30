package view;

import model.UserData;
import spliter.DataSplit;

import java.util.Scanner;

public class UserView {
    public UserView(){
    }

    public void run(){

        System.out.println("=======Program START========");
        System.out.println();
        System.out.println("Please enter info about user in one line, separated by space: \n");
        System.out.println("1. Last name First name Name by father");
        System.out.println("2. Date of Birth in format dd.mm.yyyy");
        System.out.println("3. Telephone number (just digits)");
        System.out.println("4. Sex: 'f' - female or 'm' - male");
        System.out.println();
        DataSplit data = new DataSplit();

        boolean flag = false;
        while (!flag){
            String userSTR = userInput("here -> ");
            data.getData(userSTR);
            flag = true;
        }
        System.out.println(data);




    }

    String userInput (String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
