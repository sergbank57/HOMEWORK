package HW_1_JavaBasicLec1_lesson_2;

import java.util.Scanner;

public class Task_2_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("укажите свое имя");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
