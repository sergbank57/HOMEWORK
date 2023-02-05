package HW_4_BJ_19_01;
//Создайте две переменные isEdekaOpen и isReweOpen,
// значения которых зависят от того, открыты магазины или нет.
        //Реализуйте логический метод canBuy, возвращающий true / false
        //Значение этой переменной должно быть true, если хотя бы один магазин открыт,
// иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.

public class Task_5 {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        boolean canBuy = isEdekaOpen | isReweOpen;
        System.out.println(canBuy);
    }

}
