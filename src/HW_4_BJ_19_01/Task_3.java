package HW_4_BJ_19_01;
//Реализовать метод, который конвертирует указанную сумму
// в евро в сумму в долларах США

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        double n = 1.1;
        System.out.println("-$-$-$-Convektor USD ---> EURO-$-$-$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount in USD");
        double amountUSD = scanner.nextDouble();
        System.out.println("amountUSD:" + amountUSD + " = " + (amountUSD * n) + " EURO");


    }

}
