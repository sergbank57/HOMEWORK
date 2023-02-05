package HW_4_BJ_19_01;
//Реализовать программу, выводящую на экран результаты сложения,
  //      вычитания, умножения и деления двух чисел.
    //    Каждая из арифметических операций должна быть реализована как отдельный метод.

public class Task_2 {
    public static void main(String[] args) {
        double x = 9  ;
        double y = 6 ;
        double resaultsum = (x + y);
        double resaultsubm = (x - y);
        double resaultmult = (x * y);
        double resaultdev = (x / y);
        System.out.println("resaultsum = " + resaultsum);
        System.out.println("resaultsubm = " + resaultsubm);
        System.out.println("resaultmult = " + resaultmult);
        System.out.println("resaultdev = " + resaultdev);
    }
}

