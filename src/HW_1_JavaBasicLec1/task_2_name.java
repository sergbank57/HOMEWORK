package HW_1_JavaBasicLec1;

import java.util.Scanner;

public class task_2_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("укажите свое имя");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
