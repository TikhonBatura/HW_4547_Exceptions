package control;

import exceptions.ParseDataException;
import exceptions.SexException;
import exceptions.UserNameExceptions;
import model.UserData;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class ParseData {
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
            .withResolverStyle(ResolverStyle.STRICT);
    CheckBirth checkBirth = new CheckBirth();

    UserData userData = new UserData();

    public void parseUserData(String [] checkStrings, UserData userData){

        try {
            for (int i = 0; i < checkStrings.length; i++) {


                    if (checkStrings[i].length() == 1 && checkStrings[i].equals("f") || checkStrings[i].equals("m")) {
                        try {
                        userData.setUserSex(checkStrings[i]);

                        } catch (IllegalArgumentException e) {
                            throw new SexException(e.getMessage());
                        }

                    } else if (Character.isDigit(checkStrings[i].charAt(0)) && checkStrings[i].contains(".")) {

                            if (!checkBirth.CheckBirthDate(checkStrings[i])) {
                                userData.setUserBirthDate(checkStrings[i]);
                            }

                    } else if (Character.isDigit(checkStrings[i].charAt(0)) && !(checkStrings[i].contains("."))) {
                        userData.setUserPhoneNumber(Integer.parseInt(checkStrings[i]));

                    } else if ((checkStrings[i].matches("[A-Za-z]+"))) {
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
        System.out.println(userData.toString());
    }
}
