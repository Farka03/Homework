package home_work_1.branching;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        int firstChoice = 1; //Объявляем переменные выбора
        int secondChoice = 2;
        float mainNum = 1024f; //float, потому что при делении нам не обязательно нужно будет целое значение. К примеру если 100 на 1024 поделим.

        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter the number you want to convert : "); //Просим юзера ввести число для конвертации
        float numberToConvert = scanner.nextInt(); //Записываем числа в переменную
        System.out.print("Please, choose what you want to convert to: bytes - 1, kilobytes - 2 : "); //Просим юзера сделать выбор
        float numberChoose = scanner.nextInt(); //Выбор записываем в переменную

        if (numberChoose == firstChoice) { //Если выбор 1, то есть в байты, то умножаем на 1024
            float converted = numberToConvert * mainNum; //Умножаем на 1024
            System.out.println("Your converted result to bytes = " + converted); //Выводим все в консоль
        } else if (numberChoose == secondChoice) { //Если выбор 2, то есть в килобайты, то делим на 1024
            float converted = numberToConvert / mainNum; //Делим на 1024
            System.out.println("Your converted result to kilobytes = " + converted); //Выводим все в консоль
        } else {
            System.out.println("You have chosen the wrong number"); //Ну и вывод в консоль, что будет если не то число при выборе
        }
        scanner.close(); //Закрываем сканнер
    }
}
