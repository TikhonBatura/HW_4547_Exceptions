package exceptions;

public class SexException extends IllegalArgumentException{

    public  SexException(String s) {
        super("There could be used  'm' or 'f' " + s);
    }
}
