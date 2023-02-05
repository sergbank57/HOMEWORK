package HW_4_BJ_19_01;
//Создайте две переменные isWeekend и isRain.
// Создайте переменную canWalk, значение которой должно быть истинным,
// если это выходной день (isWeekend=true) и не идет дождь (isRain=false).

public class Task_4 {

    public static void main(String[] args) {
        Boolean isWeekend = true;
        Boolean isRain = false;
        Boolean canWalk = isWeekend && !isRain;
        System.out.println(canWalk);


    }
}

