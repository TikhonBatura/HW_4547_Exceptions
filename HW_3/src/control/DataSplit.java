package control;

public class DataSplit {
    String [] data;

    private void data (String [] data){
        this.data = data;
    }

    public String [] getData (String data){
        checkData(data);
        return data.split(" ");
    }

    private static void parseCode(int code) {
        switch (code){
            case 0:
                System.out.println("Nothing was input");
                break;
            case 1:
                System.out.println("You have input less information than it need");
                break;
            case 2:
                System.out.println("You have input more information than it need");
                break;
            default:
                System.out.println("Data was successful inputted");
        }
    }

    private void checkData(String data) {

        int codeError = -1;
        if (data.equals(" ") || (data.isEmpty())){
            codeError = 0;
        }

        String [] result = data.split(" ");

        if (result.length < 6 && result.length > 1) {
            codeError = 1;
        }
        if (result.length > 6) {
            codeError = 2;
        }
        parseCode(codeError);
    }
}
