// Russian text use windows-1251 unicode;

/*
�������� ���:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
����������� � �������:

� ������ ���� ������ ���������� ������������ ������.
����������� try - catch, ����� �������� ������������ "if - else"
� ��������� �������� d �������� ��� ����� ��� ���, �.�. ��� �������� uncheckable �����������.
��� IDEA ���������� �������� (double) � 29 ������ ����� intArray,
����� ��� ������� "�������" �������� �������� double.
 */

public class Task_2 {
    public static void main(String[] args) {

        int [] intArray = new int[]{1,2,3,4,5,6,7,8,9};
            int d = 2;

            if(d == 0){
                System.out.println("�� ���� ������ ������");
            } else {
                double catchedRes1 =  (double) intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
    }
}
