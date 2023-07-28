// Russian text use windows-1251 unicode;

/*
Исходный код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
Комментарии к заданию:

в данном коде сперва необходимо инициировать массив.
Конструкцию try - catch, можно заменить конструкцией "if - else"
и проверять значение d является оно нулем или нет, т.к. это является uncheckable исключением.
еще IDEA подсказала добавить (double) в 29 строке перед intArray,
чтобы при делении "интовых" значений получать double.
 */

public class Task_2 {
    public static void main(String[] args) {

        int [] intArray = new int[]{1,2,3,4,5,6,7,8,9};
            int d = 2;

            if(d == 0){
                System.out.println("На ноль делить нельзя");
            } else {
                double catchedRes1 =  (double) intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
    }
}
