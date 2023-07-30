package model;

public class UserData {
    String userName;
    String userBirthDate;
    int UserPhoneNumber;
    char UserSex;

    public UserData (){

    }
    public UserData (String userName, String userBirthDate, int userPhoneNumber, char userSex){
        this.userName = userName;
        this.userBirthDate = userBirthDate;
        this.UserPhoneNumber = userPhoneNumber;
        this.UserSex = userSex;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserBirthDate() {
        return userBirthDate;
    }

    public int getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public char getUserSex() {
        return UserSex;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserBirthDate(String userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        UserPhoneNumber = userPhoneNumber;
    }

    public void setUserSex(char userSex) {
        UserSex = userSex;
    }
}
