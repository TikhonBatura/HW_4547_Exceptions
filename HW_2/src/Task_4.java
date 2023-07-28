import java.util.Objects;
import java.util.Scanner;

// Russian text use windows-1251 unicode;
public class Task_4 {
    public static void main(String[] args) {
        boolean flag = false;
        while (!flag) {
            String value;
            try {
                value = prompt("������� ������: ");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println(value);
            flag = true;
        }
    }

    static String prompt(String message) {          // ����� ��� ����� ������;
        Scanner in = new Scanner(System.in);
        String line = "";
        System.out.print(message);
        String userInput = in.nextLine();
        if ((line.equals(userInput))) {
            throw new IllegalArgumentException("������ �� ����� ���� ������");
        } return userInput;
    }

}
