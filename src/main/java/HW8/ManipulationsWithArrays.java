package HW8;

import java.util.Arrays;

public class ManipulationsWithArrays {

    /*
    Написать метод multiplуArrayByNumber(), который принимает
    на вход массив целых чисел и число int number. Метод возвращает
    массив тех же чисел, умноженных на number
     */


    public static int[] multiplуArrayByNumber(int[] array, int number) {

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
    public static double[] toDoubleArray(int[] array){

        if (array == null) {

            return new double[0];
        }
        if(array.length == 0){

            return new double[0];
        }
        double[] arrayDouble = new double[array.length];

        for(int i = 0;i < array.length;i++){
            arrayDouble[i] = array[i];
        }

        return arrayDouble;
    }

    public static void main(String[] args) {

        int[] array = {0, 0, 0, 4, 5};
        System.out.println(Arrays.toString(toDoubleArray(array)));
    }

}
