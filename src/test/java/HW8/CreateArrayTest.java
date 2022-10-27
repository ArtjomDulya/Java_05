package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {


    /*
    the createIntArray() method, which takes 5 integers as input and returns an array of the same numbers.
     */

//    Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    //1.1 Positive Happy path
    @Test

    public void startTestArrayInt_HappyPath() {

//    arrange
        int[] expectedResult = {1, 2, 3, 4, 5};

//    act
        int[] actualResult = new CreateArray().createIntArray(1, 2, 3, 4, 5);

//    assert
        Assert.assertEquals(actualResult, expectedResult);


    }

    //1.2 Positive Happy path
    @Test

    public void startTestArrayDouble_HappyPath() {

//    arrange
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

//    act
        double[] actualResult = new CreateArray().createDoubleArray(1.1, 2.5,
                3.7, 4.0, 5.5);

//    assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //1.3 Positive Happy path
    @Test

    public void startTestArrayString_HappyPath() {

//    arrange
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

//    act
        String[] actualResult = new CreateArray().createStringArray("It", "was", "an",
                "apple", "pie");

//    assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //1.3 Positive Happy path
    @Test

    public void startTestArrayStringSplit_HappyPath() {

//    arrange
        String[] expectedResult = {"It", "was", "an",
                "apple", "pie"};

//    act
        String[] actualResult = new CreateArray().createArrayFromText("It was an apple pie");

//    assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
