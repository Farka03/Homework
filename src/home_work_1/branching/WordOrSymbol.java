package home_work_1.branching;

import java.util.Scanner;

public class WordOrSymbol {
    public static void main(String[] args){
        int firstMin = 65; //Объявляем переменные
        int firstMax = 90;
        int secondMin = 97;
        int secondMax = 122;

        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter an ASCII code : "); //Просим юзера ввести ASCII код
        int asciiCode = scanner.nextInt(); //Записываем значение в переменную

        if (asciiCode >= firstMin && asciiCode <= firstMax) { //Если код больше/равен 65 или меньше/равен 90, то выводим букву
            char ch = (char) asciiCode; //Делаем преобразование и записываем в переменную
            System.out.println("Letter : " + ch); //Вывод в консоль нашей буквы
        } else if (asciiCode >= secondMin && asciiCode <= secondMax) { //Если код больше/равен 97 или меньше/равен 122, то выводим букву
            char ch = (char) asciiCode; //Делаем преобразование и записываем в переменную
            System.out.println("Letter : " + ch); //Вывод в консоль нашей буквы
        } else { //Если код не подходит ни одному промежутку, то:
            char ch = (char) asciiCode; //Делаем преобразование и записываем в переменную
            System.out.println("Other character : " + ch); //Вывод какого-то другого символа
        }
    }
}
