package org.example;

import org.example.melody.Chord;
import org.example.melody.MelodyGenerator;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите аккорды через пробел, например: C G Am F");

        // Чтение строки ввода от пользователя
        String input = scanner.nextLine();

        // Проверка на пустой ввод
        if (input.trim().isEmpty()) {
            System.out.println("Вы не ввели аккорды.");
            return;
        }

        Runner runner = new Runner();
        System.out.println("Сгенерированная мелодия: " + runner.run(input));

        // Закрытие сканера
        scanner.close();
    }
}