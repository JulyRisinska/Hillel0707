package Lessons.Lesson2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите число 1: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Вы ввели число:" + number);

        int number1=1;
        int number2=2;

        if (number1 > number2) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }
    }
}