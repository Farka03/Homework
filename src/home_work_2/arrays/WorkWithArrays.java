package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class WorkWithArrays {
    public static void main(String[] args){
        sumEven();
        maxEven();
        averageValue();
        twoMinimums();
        squeeze();
        sumNumbersArray();
    }
    //Нахождение суммы всех четных чисел в массиве
    public static int sumEven(){
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    //Нахождение максимального четного числа в массиве
    public static void maxEven(){
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                if(array[i] > maxValue){
                    maxValue = array[i];
                }
            }
        }
        System.out.println("Max even is : " + maxValue);
    }
    //Нахождение всех чисел меньше среднеарифмитического
    public static void averageValue(){
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }

        int average = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (i < average) {
                System.out.println("Less than arithmetic mean : " + "\t" + i);
            }
        }
    }
    //Два минимальных числа
    public static void twoMinimums(){
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int minimum = Integer.MAX_VALUE;
        int minimum2 = Integer.MAX_VALUE - 1;

        for (int element : array) {
            if (element < minimum) {
                minimum2 = minimum;
                minimum = element;
            }
        }
        System.out.println("Two minimums : " + minimum + " и " + minimum2);
    }
    //Сжать массив
    public static void squeeze(){
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 25) {
                counter++;
                for (int k = i; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - counter] = 0;
                i--;
            }
        }
        System.out.println("Your squeezed array : ");
        for (int i = 0; i < array.length; i++)
            System.out.print(i + " ");
        }
        //Сумма цифр массива
        public static void sumNumbersArray(){
            int[] array = ArraysUtils.arrayRandom(50, 100);
            int sum = 0;

            for (int element : array) {
                if (element > 9) {
                    int first = element / 10;
                    int second = element % 10;
                    if (first <= 9) {
                        sum += first + second;
                    }
                    if (first > 9) {
                        int x = first / 10;
                        int y = first % 10;
                        sum += x + y + second;
                    }
                } else {
                    sum += element;
                }
            }
            System.out.println(sum);
        }
    }




