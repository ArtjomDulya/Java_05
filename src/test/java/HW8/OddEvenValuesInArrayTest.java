package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    /*
    Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
    и возвращает количество четных чисел в этом массиве
     */

    //    1.1 Positive testing Happy path
    @Test
    public void startTestAcceptsArrayWholeIntReturnsArraysEvenInt() {

//        arrange
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expectedResult = 5;

//        act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

//        assert
        Assert.assertEquals(actualResult, expectedResult);
    }


/*
Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
и возвращает количество нечетных чисел в этом массиве

 */

    //1.2 Positive testing Happy path
    @Test
    public void startTestAcceptsArrayWholeIntReturnsArraysOddInt() {

//        arrange
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 9, 9};
        int expectedResult = 6;

//        act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

//        assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}

