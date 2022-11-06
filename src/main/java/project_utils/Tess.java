package project_utils;

import com.sun.source.doctree.SummaryTree;

public class Tess {

    public static boolean AreValuesGreaterThanNumber(int[] array, int number) {

        if (array.length == 0) {
            return false;
        }

        int countOfBiggerElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                countOfBiggerElements++;
            }
        }

        if (countOfBiggerElements == array.length) {
            return true;
        }

        return false;
    }






    public static void main(String[] args){












    }
}
