import java.util.Arrays;

// Russian text use windows-1251 unicode;
/*
»сходный код:

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("„то-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("”казатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("ћассив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

 омментарии к заданию:

ѕервым делом удал€ем "throws Exception" из main метода, т.к. это груба€ ошибка
и в итоге основной метод будет исполн€тьс€ не смотр€ ни на какие ошибки.

¬ методе printSum так же можно убрать throws, т.к. там происходит действие суммы предложенных значений,
а значит будет правильнее сделать проверку либо внутри метода. Ћибо в нашем случае, т.к. все значени€
предопределены заранее, можно не провер€ть.

ƒалее из блока try-catch выносим все, что не относитс€ к инициализации и операци€м с массивом.
«атем мен€ем пор€док отлова ошибок catch:
    1. провер€ем существует ли вообще объект к которому обращаемс€ или не €вл€етс€ ли он null,
    но есть подозрение, что он тут вообще не нужен,
    т.к. € как не пыталс€ не смог получить такого исключени€ в данном коде... =/;
    2. провер€ем не выходим ли мы за пределы массива;
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
            System.out.println("”казатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("ћассив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("„то-то пошло не так...");
        }

    }
    public static void printSum (int a, int b){
        System.out.println(a + b);
    }
}
