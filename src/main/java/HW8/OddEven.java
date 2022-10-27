package HW8;

public class OddEven {

//    В классе HW8.Algorithms.OddEven создать алгоритм oddEven(),
//    который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
//    и “Even”, если число четное.

    public String oddEven(int number){

        if(number % 2 == 0){
            return "Even";
        }else{
           return "Odd";
        }
    }
}
