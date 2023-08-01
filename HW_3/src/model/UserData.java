package model;

public class UserData {
    String [] userName;
    String userBirthDate;
    int userPhoneNumber;
    String userSex;

    public UserData (){

    }
    public UserData (String [] userName, String userBirthDate, int userPhoneNumber, String userSex){
        this.userName = new String[3];
        this.userBirthDate = userBirthDate;
        this.userPhoneNumber = userPhoneNumber;
        this.userSex = userSex;
    }

    public String[] getUserName() {
        return userName;
    }

    public String getUserBirthDate() {
        return userBirthDate;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserName(String lastname, String name, String surname ) {
        this.userName = new String[]{lastname, name, surname};
    }

    public void setUserBirthDate(String userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }


    private String getInfo(){
        return String.format("User Name - " + userName + "\n"
                                + "Date of birth - " + userBirthDate + "\n"
                                + "Phone number - " + userPhoneNumber + "\n"
                                + "Sex - " + userSex + "\n");
    }
    @Override
    public String toString(){

        return getInfo();
    }
}
