package HW8;

import java.util.Arrays;

public class OddEvenValuesInArray {
    /*
    Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
    и возвращает количество четных чисел в этом массиве
     */

    public static int countEvenValuesInArray(int[] arrayNumber) {


        int[] evenNumber = new int[arrayNumber.length];

        int j = 0;
        for (int i = 0; i < arrayNumber.length; i++) {

            if (arrayNumber[i] % 2 == 0) {

                evenNumber[j++] = arrayNumber[i];
            }
        }
        return j;
    }

//    Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
//    и возвращает количество нечетных чисел в этом массиве


    public static int countOddValuesInArray(int[] arrayWhole) {

        int j = 0;

        for (int i = 0; i < arrayWhole.length; i++) {
            if (arrayWhole[i] % 2 != 0) {
                j++;
            }
        }

        return j;
    }


}
