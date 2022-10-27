package HW8;

public class AreNumbersEqual {
    
    /*
    Напишите алгоритм HW8.Algorithms.AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
    0, если числа равны
    -1, если первое число меньше второго
    1, если первое число больше второго
     */
    
    public int areNumberEqual(int number1, int number2){
        if(number1 == number2){
            return 0;
        } else if (number1 < number2) {
            return -1;
        } else if (number1 > number2) {
            return 1;
        }else{
            return Integer.getInteger("Happy");
        }
    }







}
