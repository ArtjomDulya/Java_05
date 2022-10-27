package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    /*
    algorithm HW8.Algorithms.AreNumbersEqual, which takes 2 any int numbers as input, and returns
    0 if the numbers are equal
    -1 if the first number is less than the second
    1 if the first number is greater than the second
     */

//   1.1 Positive testing Happy Path

    @Test
    public void testStartNumberEqual_HappyPath(){

//        arrange

        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;

//        act

        int actualResult = new AreNumbersEqual().areNumberEqual(number1, number2);

//        assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    //   1.2 Positive testing Happy Path

    @Test
    public void testStartNumberLess_HappyPath(){

//        arrange

        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;

//        act

        int actualResult = new AreNumbersEqual().areNumberEqual(number1, number2);

//        assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    //   1.3 Positive testing Happy Path

    @Test
    public void testStartNumberGreater_HappyPath(){

//        arrange

        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;

//        act

        int actualResult = new AreNumbersEqual().areNumberEqual(number1, number2);

//        assert

        Assert.assertEquals(actualResult, expectedResult);
    }
}
