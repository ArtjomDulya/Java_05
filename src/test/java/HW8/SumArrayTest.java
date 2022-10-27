package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    /*
    HW8.Algorithms.SumArray algorithm that
    returns the sum of all
    numbers in an array
    1.1Positive testing Happy path
    */

    @Test
    public void testStartSum_HappyPath() {

//    Arrange

        int[] Array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

//    act

        int actualResult = new SumArray().sumArrays(Array);

//    Assert

        Assert.assertEquals(actualResult, expectedResult);


    }

//  1.2Positive testing Happy path

    @Test
    public void testStartSumNegativeNumbers_HappyPath() {

//    Arrange

        int[] Array = {-7, -3};
        int expectedResult = -10;

//    act

        int actualResult = new SumArray().sumArrays(Array);

//    Assert

        Assert.assertEquals(actualResult, expectedResult);


    }
}
