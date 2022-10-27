package HW8;

public class BiggerValue {

    /*
    Напишите алгоритм HW8.Algorithms.BiggerValue, который из двух параметров
    типа int возвращает бОльшее значение.
     */

    public int biggerValue(int number1, int number2) {

        if (number1 > number2) {

            return number1;
        } else if (number1 < number2) {

            return number2;
        } else {
            return 0;
        }

    }

}