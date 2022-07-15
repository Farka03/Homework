package home_work_1.branching;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter your first number : "); //Просим юзера ввести первое число
        int numberFirst = scanner.nextInt();
        System.out.print("Please, enter your second number : "); //Просим юзера ввести второе число
        int numberSecond = scanner.nextInt();
        System.out.print("Please, enter your third number : "); //Просим юзера ввести третье число
        int numberThird = scanner.nextInt();

        int maxValue = Math.max(Math.max(numberFirst, numberSecond), numberThird); //При использовании библиотеки Math нахожу максимальное число из трех
        int minValue = Math.min(Math.min(numberFirst, numberSecond), numberThird); //При использовании библиотеки Math нахожу минимальное число из трех
        int averageNumber= numberFirst + numberSecond + numberThird - (minValue + maxValue); //Нахожу среднее значение трех чисел
        System.out.println("Your average value : " + averageNumber); //Вывожу ответ

        scanner.close(); //Закрываем сканнер
    }
}
