package HW8;

import java.util.Arrays;

public class ManipulationsWithArrays {

    /*
    Написать метод multiplуArrayByNumber(), который принимает
    на вход массив целых чисел и число int number. Метод возвращает
    массив тех же чисел, умноженных на number
     */


    public int[] multiplуArrayByNumber(int[] array, int number) {

        if (array == null) {
            return new int[0];
        }
        if (number == 0) {

            return array;
        }
        if (array.length == 0) {

            return new int[0];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * number;
        }

        return array;
    }

    //    Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
//    и возвращает массив типа double[] из тех же чисел
    public double[] toDoubleArray(int[] array) {

        if (array == null) {

            return new double[0];
        }
        if (array.length == 0) {

            return new double[0];
        }
        double[] arrayDouble = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayDouble[i] = array[i];
        }

        return arrayDouble;
    }

    /*
    Написать метод toIntArray(), который принимает на вход массив типа double[],
    и возвращает массив типа int[] из тех же чисел
     */

    public int[] toIntArray(double[] array) {

        if (array == null) {

            return new int[0];
        }
        if (array.length == 0) {

            return new int[0];
        }

        int[] arrayInt = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            arrayInt[i] = (int) array[i];
        }

        return arrayInt;
    }

    /*
    Написать метод toStringArray(), который принимает на вход массив целых чисел,
    и возвращает массив типа String[] из тех же чисел
    (желательно не использовать метод .toString(), нужно переводить вручную)
     */

    public String[] toStringArray(int[] array) {

        String[] arrayString = new String[array.length];

        for (int i = 0; i < array.length; i++) {

            arrayString[i] = "" + array[i];
        }

        return arrayString;
    }

    /*
    Перегрузить метод toStringArray() параметром double[].
    Этот метод должен возвращать массив типа String[]
    (желательно не использовать метод .toString(), нужно переводить вручную)
     */

    public String[] toStringArray(double[] array) {

        String[] str = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            str[i] = "" + array[i];
        }

        return str;
    }

    /*
    В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
    который принимает на вход массив целых чисел и число number.
    Метод возвращает значение true, если все элементы массива больше number,
    иначе возвращает false
    */

    public boolean areValuesGreaterThanNumber(int[] arrayWhole, int number) {

        int j = 0;

        for (int i = 0; i < arrayWhole.length; i++) {
            if (arrayWhole[i] > number) {
                j++;
            }
            if (j == arrayWhole.length) {

                return true;
            }
        }

        return false;
    }


}
