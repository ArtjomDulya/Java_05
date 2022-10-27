package HW8;

import java.util.Arrays;



public class OddIndices {

    public int[] oddIndices(int[] arrayNumber) {


        int[] newArray = new int[arrayNumber.length / 2]; // объявляем новый массив, который
            // забирает у другого массива символы нечетных индексов
            // это 3 числа со значением {0, 0, 0}

            int x = 1; // переменная, которая играет роль нечетного индекса и нужна для цикла for

            for (int i = 0; i < newArray.length; i++) { // длина массива newArray.length = 3
                newArray[i] = arrayNumber[x]; // newArray забирает число от индекса массива arrayNumber
                // с присвоенным x = 1
                x += 2; // к числу с индексом х прибавляется +2 для следующего цикла
            }

            return newArray;
        }

}



















//    public static void main(String[] args) {
//        int mass1[];
//        mass1 = new int[]{3, 5, 9, 10, 11, 14};
//        int n = 0;
//        for (int x = 0; x < mass1.length; x++) {
//            if (mass1[x] % 2 - 1 == 0) {
//                n = mass1[x];
//                System.out.println("* Нечетные элементы = " + n);
//            }
//        }
//    }
