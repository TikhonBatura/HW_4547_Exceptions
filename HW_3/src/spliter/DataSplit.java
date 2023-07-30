package spliter;

public class DataSplit {
    String data;

    private void data (String data){
        this.data = data;
    }

    public String [] getData (String data){

        int code = checkData(data);
        parseCode(code);
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

    private int checkData(String data) {

        if (data.equals(" ") || (data.isEmpty())){
            return 0;
        }

        String [] result = data.split(" ");

        if (result.length < 4 && result.length > 1) {
            return 1;
        }
        if (result.length > 4) {
            return 2;
        }
        return 3;
    }
}
