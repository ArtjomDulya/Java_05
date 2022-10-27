package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    /*
    HW8.Algorithms.BiggerValue algorithm, which of the two
    int parameters returns the larger value
     */

//    1. Positive testing Happy path

    @Test
    public void testStartLargerValue_HappyPath() {
//  arrange

        int value1 = 3333;
        int value2 = 9999;
        int expectedResult = 9999;

//  act

        int actualResult = new BiggerValue().biggerValue(value1, value2);

//  assert

        Assert.assertEquals(actualResult, expectedResult);
    }

}
