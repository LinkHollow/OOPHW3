package task01;

import java.util.Random;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    protected double payHour;

    protected double hours;

    public double getPayHour() {
        return payHour;
    }

    static Random random = new Random();

    public double getHours() {
        return hours;
    }

    public Freelancer (String name, String surname, double salary, int age, double hours, double payHour) {
        super(name, surname, salary, age);
        this.hours = hours;
        this.payHour = payHour;
    }


    @Override
    public double calculateSalary() {
        return salary = payHour * hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d; Оплата часа: %.2f (руб.); Кол-во часов: %.0f  Итоговая заработная плата: %.2f (руб.);",
                surname, name, age, payHour, hours, calculateSalary());
    }
}
