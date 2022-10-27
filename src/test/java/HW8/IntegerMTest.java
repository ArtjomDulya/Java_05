package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerMTest {

    /*
    Given an integer M perform the following conditional actions:
    If M is multiple of 7 and 9 then return "Good Number".
    If M is only multiple of 9 and not of 7  then return "Bad Number"
    If M is only multiple of 11 then return "Poor Number"
    If M doesn't satisfy any of the above conditions then return "-1"
     */

//    test Data:
    //good number - 63
    //bad number - 9
    //poor number - 11
    //-1 - 100

    //  1.1 Positive testing Happy path

    @Test
    public void testStartGoodNumber_HappyPath() {

//        arrange
        int M = 63;
        String expectedResult = "Good Number";

//        act
        String actualResult = new IntegerM().integerM(M);

//        assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //    1.2 Positive testing Happy path

    @Test
    public void testStartBadNumber_HappyPath() {

//        arrange
        int M = 9;
        String expectedResult = "Bad Number";

//        act
        String actualResult = new IntegerM().integerM(M);

//        assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //  1.3 Positive testing Happy path

    @Test
    public void testStartPoorNumber_HappyPath() {

//        arrange
        int M = 11;
        String expectedResult = "Poor Number";

//        act
        String actualResult = new IntegerM().integerM(M);

//        assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //  1.4 Positive testing Happy path

    @Test
    public void testStartNegativeNumber_HappyPath() {

//        arrange
        int M = 100;
        String expectedResult = "-1";

//        act
        String actualResult = new IntegerM().integerM(M);

//        assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
