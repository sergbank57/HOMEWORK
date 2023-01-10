package HW_1_JavaBasicLec1_lesson_2;

import java.util.Scanner;

public class task_5_AVERAGE {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите три целых числа");

        Integer firstintegerNumber = scanner.nextInt();
        Integer  secondintegerNumber = scanner.nextInt();
        Integer thirdintegerNumber = scanner.nextInt();
        double resaultaverage =  calculator.Average(firstintegerNumber,secondintegerNumber,thirdintegerNumber );
        System.out.println("Resault Average = " + resaultaverage);
    }
}
