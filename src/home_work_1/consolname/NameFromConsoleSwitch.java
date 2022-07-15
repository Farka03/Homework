package home_work_1.consolname;

import java.util.Scanner;

public class NameFromConsoleSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Пожалуйста, введите имя : "); //Юзер вводит имя
        String name = scanner.nextLine(); //Записываем в переменную

        switch (name) { //Берем имя
            case ("Вася") : { //Если Вася, то выводим это
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            }
            case ("Анастасия") : //Если Анастасия, то выводим это
                System.out.println("Я тебя так долго ждал");
                break;
            default : //Если ни то ни другое, то выводим это
                System.out.println("Добрый день, а вы кто?");
                break;
        }
        scanner.close(); //Закрываем сканнер
    }
}
