package home_work_1.branching;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter your number : "); //Просим юзера ввести число
        int number = scanner.nextInt(); //Число записывается в переменную

        if (number % 2 == 0) {
            System.out.println("Your number is even"); //Если без остатка на 2 делится, то четное
        } else {
            System.out.println("Your number is odd");//Если не делится без остатка, то нечетное
        }
        scanner.close(); //Закрываем сканнер
    }
}

