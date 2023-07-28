import java.util.Arrays;

// Russian text use windows-1251 unicode;
/*
Исходный код:

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

Комментарии к заданию:

Первым делом удаляем "throws Exception" из main метода, т.к. это грубая ошибка
и в итоге основной метод будет исполняться не смотря ни на какие ошибки.

В методе printSum так же можно убрать throws, т.к. там происходит действие суммы предложенных значений,
а значит будет правильнее сделать проверку либо внутри метода. Либо в нашем случае, т.к. все значения
предопределены заранее, можно не проверять.

Далее из блока try-catch выносим все, что не относится к инициализации и операциям с массивом.
Затем меняем порядок отлова ошибок catch:
    1. проверяем существует ли вообще объект к которому обращаемся или не является ли он null,
    но есть подозрение, что он тут вообще не нужен,
    т.к. я как не пытался не смог получить такого исключения в данном коде... =/;
    2. проверяем не выходим ли мы за пределы массива;
    3. отлавливаем все другие возможные ошибки и выводим об этом сообщение.

 */
public class Task_3 {
    public static void main(String[] args) {

            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
        try {
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }
    public static void printSum (int a, int b){
        System.out.println(a + b);
    }
}
