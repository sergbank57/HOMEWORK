package HW_1_JavaBasicLec1;

import java.util.Scanner;

public class task_4_PerAreaCirc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите радиус круга:");
        double radiuscirc= scanner.nextDouble();

    double resaultarea = (Math.PI * Math.pow(radiuscirc, 2 ));
        System.out.println("Area is = " +resaultarea );
        double resaultperimetr = (2 * Math.PI * radiuscirc);
        System.out.println("Perimeter is = " + resaultperimetr);
    }

}