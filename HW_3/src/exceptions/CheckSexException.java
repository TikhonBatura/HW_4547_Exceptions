package exceptions;

public class CheckSexException extends IllegalArgumentException{

    private String s;
    public CheckSexException(String s) {
        super("There could be used  'm' or 'f' " + s);
    }
}
