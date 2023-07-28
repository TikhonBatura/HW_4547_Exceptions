// Russian text use windows-1251 unicode;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        boolean flag = false;
        while (!flag) {
            String value = prompt("Введите дробное число: ");
            if (checkIfInputText(value)) {
                System.out.println("Вы ввели: " + value);
                flag = true;
            }
        }
    }

     static String prompt(String message) {          // метод для ввода строки;
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    static boolean checkIfInputText(String input){ // метод проверяющий возможно ли преобразования строки во Float число.
        try {
            Float.parseFloat(input);
        } catch (NumberFormatException e){
            System.out.println("Некорректный ввод. Надо ввести число");
            return false;
        }
        return true;
    }
}
