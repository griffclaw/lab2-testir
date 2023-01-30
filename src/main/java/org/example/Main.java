package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите год в формате уууу ");
        int year = scn.nextInt();
        if (year % 400 == 0) {
            System.out.println("Результат вычесления 366 дней ");
        } else if (year % 100 == 0) {
            System.out.println("Результат вычесления 365 дней");
        } else if (year % 4 == 0){
            System.out.println("Результат вычесления 366 дней");
        } else {
            System.out.println("Результат вычесления 365 дней");
        }
    }
}