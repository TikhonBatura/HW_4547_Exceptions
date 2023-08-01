package control;

import exceptions.CheckBirthdayExceptions;
import exceptions.CheckSexException;
import model.UserData;

import java.util.Arrays;

public class ParseData {

    UserData userData = new UserData();

    public void checkUserData (String [] userData){

        for (int i = 0; i < userData.length; i++){
            if (userData[i].length() == 1 && userData[i].equals("f") || userData[i].equals("m")) {
                try {
                    this.userData.setUserSex(userData[i]);
                } catch (CheckSexException e) {
                    e.getMessage();
                }

            } else if (Character.isDigit(userData[i].charAt(0)) && userData[i].contains(".")){
                try{
                    this.userData.setUserBirthDate(userData[i]);
                } catch (RuntimeException e){
                    throw new CheckBirthdayExceptions(userData[i]);
                }

            } else if (Character.isDigit(userData[i].charAt(0)) && !(userData[i].contains("."))){
                    this.userData.setUserPhoneNumber(Integer.parseInt(userData[i]));

            } else

                this.userData.setUserName(userData[i], userData[i+1], userData[i+2]);

        }
        System.out.println(Arrays.toString(userData));
    }
}
