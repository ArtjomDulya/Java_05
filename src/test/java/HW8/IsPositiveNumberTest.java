package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    /*
    the HW8.Algorithms.IsPositiveNumber algorithm, which returns true if the numerical
    parameter is greater than or equal to zero, and returns false if
    the parameter is less than 0.
     */

//  1.1Positive testing Happy path

    @Test
    public void testStartGreaterToZero_HappyPath() {

//    arrange

        int number = 555;
        boolean expectedResult = true;

//    act

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

//    assert

        Assert.assertEquals(actualResult, expectedResult);
    }

//  1.2Positive testing Happy path

    @Test
    public void testStartEqualToZero_HappyPath() {

//    arrange

        int number = 0;
        boolean expectedResult = true;

//    act

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

//    assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    //  1.3Positive testing Happy path

    @Test
    public void testStartLessToZero_HappyPath() {

//    arrange

        int number = -555;
        boolean expectedResult = false;

//    act

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

//    assert

        Assert.assertEquals(actualResult, expectedResult);
    }


}
