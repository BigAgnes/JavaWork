package com.company;

import java.util.Scanner;

public class HomeworkNormal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите пол (где 0 - женский, 1 - мужской): ");
        int gender = scanner.nextInt();
        if (gender == 0)
            System.out.println("Привет дорогая " + name);
        else if (gender == 1)
            System.out.println("Привет дорогой " + name);
        else
            System.out.println("Вы ввели некорректное значение поля 'Пол'");
    }
}
