package home_work_1.consolname;

import java.util.Objects;
import java.util.Scanner;

public class NameFromConsoleIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Пожалуйста, введите ваше имя : "); //Юзер вводит имя
        String name = scanner.nextLine(); //Записываем в переменную

        if (Objects.equals(name, "Вася")) { //Если имя Вася
            System.out.println("Привет!"); //То выводим эти сообщения
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(name, "Анастасия")) { //Если Анастасия
            System.out.println("Я тебя так долго ждал"); //То это сообщение
        }
        if (!Objects.equals(name, "Вася") && !Objects.equals(name, "Анастасия")) {
            System.out.println("Добрый день, а вы кто?"); //Если ни то ни другое, то это
        }
        scanner.close(); //Закрываем сканнер
    }
}

