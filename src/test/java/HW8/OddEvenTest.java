package HW8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

//    1.Positive testing happy path
//      if(number % 2 == 0)
//      return "Even";

//  1.1Positive testing Happy path

    @Test
    public void testStartOdd_HappyPath() {

//    arrange

        int number = -345;

        String expectedResult = "Odd";

//    act

        String actualResult = new OddEven().oddEven(number);

//     assert

        Assert.assertEquals(actualResult, expectedResult);
    }


//  1.2 Positive testing Happy path

    @Test
    public void testStartHonest_HappyPath() {

//    arrange

        int number = 0;

        String expectedResult = "Even";

//    act

        String actualResult = new OddEven().oddEven(number);

//     assert

        Assert.assertEquals(actualResult, expectedResult);

    }

//  1.3 Positive testing Happy path

    @Test
    public void testStartHonest2_HappyPath() {

//    arrange

        int number = 222222;

        String expectedResult = "Even";

//    act

        String actualResult = new OddEven().oddEven(number);

//     assert

        Assert.assertEquals(actualResult, expectedResult);


    }


}
