package HW_4_BJ_19_01;
//Представим, что у нас есть устройство, в котором две колбы.
// Прибор работает корректно, если температура первой колбы выше 100 градусов,
// а температура второй колбы меньше 100 градусов. Вы должны написать метод,
// который проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
// В результате он выводит сообщение true или false.

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input Temp flask 1");
       double temper1 = scanner.nextDouble();
        System.out.println(" input Temp flask 2");
        double temper2 = scanner.nextDouble();
       boolean temperature1 = temper1 >100  ;
       boolean temperature2 = temper2 < 100;
        boolean deviceWith2Flask = temperature1 && temperature2;
        System.out.println("deviceWith2Flask works correctly- " + deviceWith2Flask);
        //if ((temperature1 < 100) && (temperature2 > 100)) {
          //  System.out.println("deviceWith2Flask works correctly -" + );
        }

       // int Temperature1 = t1;
        //int Temperature2 = t2;
    //    if t1 < 100 { Temperature1 = true
    }

