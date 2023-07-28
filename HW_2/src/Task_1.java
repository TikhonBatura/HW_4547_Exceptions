// Russian text use windows-1251 unicode;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        boolean flag = false;
        while (!flag) {
            String value = prompt("������� ������� �����: ");
            if (checkIfInputText(value)) {
                System.out.println("�� �����: " + value);
                flag = true;
            }
        }
    }

     static String prompt(String message) {          // ����� ��� ����� ������;
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    static boolean checkIfInputText(String input){ // ����� ����������� �������� �� �������������� ������ �� Float �����.
        try {
            Float.parseFloat(input);
        } catch (NumberFormatException e){
            System.out.println("������������ ����. ���� ������ �����");
            return false;
        }
        return true;
    }
}
