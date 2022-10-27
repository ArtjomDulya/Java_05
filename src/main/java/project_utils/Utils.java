package project_utils;

public class Utils {
    static int number = 0;

    public static void print() {
        System.out.println("Tack " + ++number);
    }

    /*
    Написать универсальный метод для построения последовательности,
    которая начинается с числа start, заканчивается числом end (оба включительно).
    Все числа в этой последовательности должны быть кратны числу step.
    Этот метод должен высчитывать первое кратное число в диапазоне [start, end]
    и строить последовательность (возрастающую или убывающую) от
    вычисленного первого кратного числа с шагом step.


     */

    public static void Metod(int start, int end, int step) {
        if (step != 0) {
            if (start <= 0 && step > 0) {
                if (start % 2 == 0) {
                    for (int i = start; i <= 0; i = step) {
                        System.out.println(i + " ");
                    }
                } else {
                    start = start + (step - start % step);
                    for (int i = start; i <= end; i += step) {
                        System.out.println(i + " ");
                    }
                }
            }
            if (start >= end && step < 0) {
                if (start % step == 0) {
                    for (int i = start; i >= end; i += step) {
                        System.out.println(i + " ");
                    }
                } else {
                    start = start - start % step;
                    for (int i = start; i >= end; i += step) {
                        System.out.println(i + " ");
                    }
                }
            } else {
                System.out.println("Error");
            }
        }
    }


    public static void main(String[] args) {
        Metod(32, 32, 4 );
    }
}

