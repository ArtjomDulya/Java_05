package HW8;

public class IntegerM {

    /*
    Для заданного целого числа M выполните следующие условные действия:
    Если M кратно 7 и 9, вернуть «Хорошее число».
    Если M кратно только 9, а не 7, верните «Неверный номер».
    Если M кратно только 11, верните «Плохое число».
    Если M не удовлетворяет ни одному из вышеперечисленных условий, верните «-1».
     */

    public String integerM(int M) {
        if (M % 7 == 0 && M % 9 == 0) {
            return "Good Number";
        }
        if (M % 9 == 0 && M % 7 != 0) {
            return "Bad Number";
        }
        if (M % 11 == 0 && M % 7 != 0 && M % 9 != 0) {
            return "Poor Number";
        } else {
            return "-1";
        }
    }
}





//good number - 63
//bad number - 9
//poor number - 11
//-1 - 100


