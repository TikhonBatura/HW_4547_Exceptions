/*
Класс презентор.
 */

package view;

import control.DataFileWriter;
import control.DataSplit;
import control.ParseData;
import exceptions.ParseDataException;
import model.UserData;

import java.util.Scanner;

public class UserView {
    public UserView(){
    }
    ParseData parseData = new ParseData();
    UserData userInfo = new UserData();

    String fileName = null;
    DataFileWriter dataFileWriter = new DataFileWriter();

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
        String[] userArr = new String[0];

        /*
        userSTR - строка, которую вводит пользователь;
        userArr - строка введенная пользователем и преобразованная в массив.
         */

        while (!flag) {
            userSTR = userInput("here -> ");
            userArr = data.getData(userSTR);

            /*
            следующий блок анализирует введенную информацию;
             */

            if (userArr.length == 6) {
                try {
                    parseData.parseUserData(userArr, userInfo); // анализ введенных данных и их структуризация.
                } catch (ParseDataException e) {
                    System.out.println(e.getMessage());
                }
                flag = parseData.checkUserDataIfNull(userInfo); // проверка все ли поля прошли проверку;
            }
        }

        /*
        Если все данный были введены корректно и соответствуют критериям, они попадают в следующий модуль, где записываются в файл.
         */

        fileName = parseData.getUserLastName(userInfo) + ".txt";

        dataFileWriter.dataWriter(userInfo, fileName);


    }

    String userInput (String message) {             // метод для ввода строк пользователем
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
