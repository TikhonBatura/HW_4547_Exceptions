/*
Анализирует полученную информацию.
 */

package control;

import exceptions.ParseDataException;
import exceptions.SexException;
import exceptions.UserNameExceptions;
import model.UserData;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class ParseData {

    CheckBirth checkBirth = new CheckBirth();


    public void parseUserData(String [] checkStrings, UserData userData){       // проверка введенных строк на соответствие параметрам.

        try {
            for (int i = 0; i < checkStrings.length; i++) {


                    if (checkStrings[i].length() == 1 && checkStrings[i].equals("f") || checkStrings[i].equals("m")) {      // проверка пола пользователя;
                        try {
                        userData.setUserSex(checkStrings[i]);

                        } catch (IllegalArgumentException e) {
                            throw new SexException(e.getMessage());
                        }

                    } else if (Character.isDigit(checkStrings[i].charAt(0)) && checkStrings[i].contains(".")) {             // проверка даты рождения пользователя;

                            if (!checkBirth.CheckBirthDate(checkStrings[i])) {
                                userData.setUserBirthDate(checkStrings[i]);
                            }

                    } else if (Character.isDigit(checkStrings[i].charAt(0)) && !(checkStrings[i].contains("."))) {          // проверка номера телефона пользователя;
                        userData.setUserPhoneNumber(Integer.parseInt(checkStrings[i]));

                    } else if ((checkStrings[i].matches("[A-Za-z]+"))) {                                              // проверка полного имени пользователя;
                        try {
                            userData.setUserName(checkStrings[i], checkStrings[i + 1], checkStrings[i + 2]);
                            i += 2;
                        } catch (IndexOutOfBoundsException e) {
                            throw new UserNameExceptions(e.getMessage());
                        }
                    }
                }

            }catch (RuntimeException e){
                throw new ParseDataException(checkStrings);
            }
//        System.out.println(userData.toString());
    }

    public boolean checkUserDataIfNull (UserData userData){             // проверка на наличие пустых полей;
        if (userData.getUserName() == null
                | userData.getUserSex() == null
                | userData.getUserBirthDate() == null
                | (userData.getUserPhoneNumber() == 0)){
            return false;
        }else return true;
    }

    public String getUserLastName(UserData userData){                   // получение фамилии пользователя
        String [] userArr = userData.getUserName();
        return userArr[0];
    }

}
