package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

//    OddIndices algorithm that takes an array of
//    integers and returns an array of odd index values


//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    //    1. Positive test
    @Test
    public void testStartReturnAnArray_HappyPath() {

//        arrange
        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

//        act
        int[] actualResult = new OddIndices().oddIndices(input);

//        assert
        Assert.assertEquals(actualResult, expectedResult);


    }
}
