package exceptions;

import java.util.Arrays;

public class ParseDataException extends RuntimeException{
    public ParseDataException (String [] message){
        super("Something wrong with parsing of - " + Arrays.toString(message) + "\n");
    }
}
