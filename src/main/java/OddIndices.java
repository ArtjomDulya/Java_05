import java.util.Arrays;

public class OddIndices {

//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}









    public static void main(String[] args) {
        int array[] = new int[] {-45,590,234,985,12,68};
        int newarray[] = new int[array.length % 2];


        System.out.println(Arrays.toString(newarray));










}

//    public static void main(String[] args) {
//        int mass1[];
//        mass1 = new int[]{3, 5, 9, 10, 11, 14};
//        int n = 0;
//        for (int x = 0; x < mass1.length; x++) {
//            if (mass1[x] % 2 - 1 == 0) {
//                n = mass1[x];
//                System.out.println("* Нечетные элементы = " + n);
//            }
//        }
//    }
}