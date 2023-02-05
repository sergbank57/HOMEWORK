package HW_4_BJ_19_01;
//// Введите 2 слова, используйте сканер, состоящий из четного количества букв
// (проверьте количество букв в слове).
    //    Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
//    распечатать на консоль.
import java.util.Scanner;

public class TASK_1 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Input two word with even letter ");
            String wordInput1 = input.nextLine();
            String wordInput2 = input.nextLine();

            System.out.println((wordInput1.substring(0,wordInput1.length()/2)) + (wordInput2.substring(wordInput2.length()/2)));
           // System.out.println(" Your number is " + wordInput2);
        //System.out.println(wordInput1.);


        }
}
