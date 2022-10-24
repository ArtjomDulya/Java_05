import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

//  1.1Positive testing Happy path
//  if (start <= end)
//    return array;

    @Test
    public void testStartLessThanEnd_HappyPath() {
//        AAA
//        arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
                "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
//        act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = new FizzBuzz().fizzbuzz(start, end);

//        Assert

        Assert.assertEquals(actualResult, expectedResult);


    }

//  1.2Positive testing Happy path
//    start == end

    @Test
    public void testStartEqualsEnd_HappyPath() {
//        AAA
//        arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};
//        act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = new FizzBuzz().fizzbuzz(start, end);

//        Assert

        Assert.assertEquals(actualResult, expectedResult);


    }

    //    1.3 Positive testing Happy path
//    if (start < end)
//    return array;
    @Ignore
    @Test
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath() {
//        AAA
//        arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz"};
//        act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = new FizzBuzz().fizzbuzz(1, 20);

//        Assert

        Assert.assertEquals(actualResult, expectedResult);


    }

//2. Negative testing
//  if (start > end)
// return new String[0];

    @Test
    public void testStartGreaterThanEnd_Negative() {
//        AAA
//        arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};
//        act

//        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = new FizzBuzz().fizzbuzz(start, end);

//        Assert

        Assert.assertEquals(actualResult, expectedResult);


    }


}