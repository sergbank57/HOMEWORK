package HW_1_JavaBasicLec1_lesson_2;

import java.util.Scanner;

public class task_1_DoubleNumber {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите два числа");

        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();
        String name = scanner.nextLine();
      double resaultsum =  calculator.sum(firstDoubleNumber,secondDoubleNumber);
      System.out.println("Resaul sum = " + resaultsum);
        double resaultsubm =  calculator.subm(firstDoubleNumber,secondDoubleNumber);
        System.out.println("Resaul subm = " + resaultsubm);
       double resaultmultip =  calculator.multip(firstDoubleNumber,secondDoubleNumber);
        System.out.println("Resaul multiplic = " + resaultmultip);
        double resaultdivis =  calculator.divis(firstDoubleNumber,secondDoubleNumber);
        System.out.println("Resaul divis = " + resaultdivis);
    }
}

