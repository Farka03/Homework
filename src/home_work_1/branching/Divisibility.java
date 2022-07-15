package home_work_1.branching;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter your dividend : "); //Просим юзера ввести первое число
        int numberFirst = scanner.nextInt(); //Записываем первое число в переменную
        System.out.print("Please, enter your divider : "); //Просим юзера ввести первое число
        int numberSecond = scanner.nextInt(); //Записываем второе число в переменную

        if (numberFirst % numberSecond == 0) { //Если первое число делится на второе без остатка, ты показываем юзеру, что все делится без остатка
            System.out.print("The first number is divided by the second without a remainder");
        } else if (numberSecond % numberFirst == 0) {
            System.out.print("The second number is divided by the first without a remainder"); //Если второе число делится на первое без остатка, ты показываем юзеру, что все делится без остатка
        } else {
            System.out.println("Alas, one number is not divisible by another"); //Если есть остаток, то делится соответственно с остатком и показываем юзеру
        }
        scanner.close(); //Закрываем сканнер
    }
}
