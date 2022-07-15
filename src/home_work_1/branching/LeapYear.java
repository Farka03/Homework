package home_work_1.branching;

import java.time.YearMonth;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter year : "); //Просим юзера ввести год
        int year = scanner.nextInt(); //Записываем год в переменную
        System.out.print("Please, enter month : "); //Просим юзера ввести месяц
        int month = scanner.nextInt(); //Записываем месяц в перменную

        YearMonth yearMonth = YearMonth.of(year, month); //Создаем объект и в параметрах указываем введенные с консоли юзером год и месяц
        boolean isLeap = yearMonth.isLeapYear(); //Проверяем, високосный ли год
        System.out.println("Leap year? : " + isLeap); //Выводим результат

        scanner.close(); //Закрываем сканнер
    }
}
