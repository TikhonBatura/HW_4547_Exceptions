import java.util.Arrays;

// Russian text use windows-1251 unicode;
/*
�������� ���:

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("���-�� ����� �� ���...");
   } catch (NullPointerException ex) {
       System.out.println("��������� �� ����� ��������� �� null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("������ ������� �� ������� ������ �������!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

����������� � �������:

������ ����� ������� "throws Exception" �� main ������, �.�. ��� ������ ������
� � ����� �������� ����� ����� ����������� �� ������ �� �� ����� ������.

� ������ printSum ��� �� ����� ������ throws, �.�. ��� ���������� �������� ����� ������������ ��������,
� ������ ����� ���������� ������� �������� ���� ������ ������. ���� � ����� ������, �.�. ��� ��������
�������������� �������, ����� �� ���������.

����� �� ����� try-catch ������� ���, ��� �� ��������� � ������������� � ��������� � ��������.
����� ������ ������� ������ ������ catch:
    1. ��������� ���������� �� ������ ������ � �������� ���������� ��� �� �������� �� �� null,
    �� ���� ����������, ��� �� ��� ������ �� �����,
    �.�. � ��� �� ������� �� ���� �������� ������ ���������� � ������ ����... =/;
    2. ��������� �� ������� �� �� �� ������� �������;
    3. ����������� ��� ������ ��������� ������ � ������� �� ���� ���������.

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
            System.out.println("��������� �� ����� ��������� �� null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("������ ������� �� ������� ������ �������!");
        } catch (Throwable ex) {
            System.out.println("���-�� ����� �� ���...");
        }

    }
    public static void printSum (int a, int b){
        System.out.println(a + b);
    }
}
