package HW_1_JavaBasicLec1;

import java.util.Scanner;

public class task_1_DoubleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите два числа");

        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}

