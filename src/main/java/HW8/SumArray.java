package HW8;

public class SumArray {

    public int sumArrays(int[] array) {


        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;


    }


}