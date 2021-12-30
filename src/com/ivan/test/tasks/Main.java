package com.ivan.test.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String NAME = "Вячеслав";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1(sc);
        task2(sc);
        task3(sc);
        sc.close();
    }

    private static void task1(Scanner sc) {
        System.out.println("Задание №1");
        System.out.println("Введите число: ");
        int count = sc.nextInt();
        System.out.println((count > 7) ? "Привет" : "Число меньше или равно 7, приветствие не требуется.");
    }

    private static void task2(Scanner sc) {
        System.out.println("\nЗадание №2");
        System.out.println("Введите имя: ");
        String name = sc.next();
        System.out.println(name.equals(NAME) ? "Привет, " + NAME : "Нет такого имени");
    }

    private static void task3(Scanner sc) {
        System.out.println("\nЗадание №3");
        System.out.println("Введите числа массива через пробел и нажмите клавишу Enter. Я найду для Вас числа кратные 3: ");
        sc.nextLine();
        String[] s1 = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String value : s1) {
            int num = Integer.parseInt(value);
            if (num % 3 == 0) {
                list.add(num);
            }
        }
        System.out.println("Числа кратные 3: " + list);

    }
}


