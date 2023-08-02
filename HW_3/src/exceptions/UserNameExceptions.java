package exceptions;

public class UserNameExceptions extends IndexOutOfBoundsException{
    public UserNameExceptions (String s){
        super("I can't parse your name" + s);
    }
}
