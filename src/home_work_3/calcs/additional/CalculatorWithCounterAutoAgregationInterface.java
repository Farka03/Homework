package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    ICalculator icalculator; //Поле
    private long counter; //Счетчик

    public CalculatorWithCounterAutoAgregationInterface(ICalculator icalculator) { //Конструктор
        this.icalculator = icalculator;
    }

    //Все методы, которые считают пример + счетчик считает
    public double division(double dividend, double divider) {
        counter++;
        return icalculator.division(dividend, divider);
    }

    public double multiplication(double firstMultiply, double secondMultiply) {
        counter++;
        return icalculator.multiplication(firstMultiply, secondMultiply);
    }

    public double subtraction(double firstSubtraction, double secondSubtraction) {
        counter++;
        return icalculator.subtraction(firstSubtraction, secondSubtraction);
    }

    public double addition(double firstAddition, double secondAddition) {
        counter++;
        return icalculator.addition(firstAddition, secondAddition);
    }

    public double degree(double number, int numberDegree) {
        counter++;
        return icalculator.degree(number, numberDegree);
    }

    public double module(double moduleNum) {
        counter++;
        return icalculator.module(moduleNum);
    }

    public double rootNumber(double rootNum) {
        counter++;
        return icalculator.rootNumber(rootNum);
    }

    //Возвращаем счетчик
    public long getCountOperation() {
        return counter;
    }
}
