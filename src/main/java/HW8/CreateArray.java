package HW8;



public class CreateArray {

    /*
    В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
    который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
    Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */
    public int[] createIntArray(int n1, int n2, int n3, int n4, int n5) {

        int[] array = new int[5];

        array[0] = n1;
        array[1] = n2;
        array[2] = n3;
        array[3] = n4;
        array[4] = n5;

        return array;
    }

    /*
    Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
    и возвращает массив из этих же чисел
    Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */

    public double[] createDoubleArray(double n, double n1, double n2, double n3, double n4) {

        double[] array = new double[5];

        array[0] = n;
        array[1] = n1;
        array[2] = n2;
        array[3] = n3;
        array[4] = n4;

        return array;
    }

    /*
    Написать метод createStringArray(), который принимает на вход 5 слов,
    и возвращает массив из этих слов  Например,
    createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public String[] createStringArray(String n, String n1, String n2, String n3, String n4) {

        String[] array = new String[5];

        array[0] = n;
        array[1] = n1;
        array[2] = n2;
        array[3] = n3;
        array[4] = n4;

        return array;
    }

//    Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов
//    и возвращает массив из этих слов.

    public String[] createArrayFromText(String str) {

        return str.split(" ");
    }


}











