package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    /*
    метод multiplуArrayByNumber(), который принимает на вход
    массив целых чисел и число int number. Метод возвращает
    массив тех же чисел, умноженных на number
     */

    //    1.1 Positive testing Happy path
    @Test
    public void startTestArrayMultipliedNumber() {

//        arrange
        int[] arrayNumber = {1, 2, 3, 4, 5};
        int multiplyNumber = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

//        act
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber
                (arrayNumber, multiplyNumber);

//        assert
        Assert.assertEquals(actualResult, expectedResult);
    }

//    Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
//    и возвращает массив типа double[] из тех же чисел

    //    1.2 Positive testing Happy path
    @Test
    public void startTestAcceptsArrayIntAndReturnsArrayDouble() {

//        arrange
        int[] arrayNumber = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

//        act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(arrayNumber);

//        assert
        Assert.assertEquals(actualResult, expectedResult);
    }

//    метод toIntArray(), который принимает на вход массив типа double[],
//    и возвращает массив типа int[] из тех же чисел

    //    1.3 Positive testing Happy path
    @Test
    public void startTestAcceptsArrayDoubleAndReturnsArrayInt() {

//        arrange
        double[] arrayNumber = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};

//        act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(arrayNumber);

//        assert
        Assert.assertEquals(actualResult, expectedResult);
    }

//    Написать метод toStringArray(), который принимает на вход массив целых чисел,
//    и возвращает массив типа String[] из тех же чисел (желательно не использовать
//    метод .toString(), нужно переводить вручную)

    //    1.4 Positive testing Happy path
    @Test
    public void startTestAcceptsArrayIntAndReturnsArrayString() {

//        arrange
        int[] arrayNumber = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

//        act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(arrayNumber);

//        assert
        Assert.assertEquals(actualResult, expectedResult);
    }

//    Перегрузить метод toStringArray() параметром double[].
//    Этот метод должен возвращать массив типа String[]
//    (желательно не использовать метод .toString(), нужно переводить вручную)

    //    1.5 Positive testing Happy path
    @Test
    public void startTestAcceptsArrayDoubleAndReturnsArrayString() {

//        arrange
        double[] arrayNumber = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

//        act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(arrayNumber);

//        assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
    В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
    который принимает на вход массив целых чисел и число number.
    Метод возвращает значение true, если все элементы массива больше number,
    иначе возвращает false
    */

    //    1.6 Positive testing Happy path
    @Test
    public void startTestAcceptsArrayIntAndReturnsBoolean() {

//        arrange
        int[] array = {16, 25, 33, 40, 55};
        int number = 5;
        boolean expectedResult = true;

//        act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

//        assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}

