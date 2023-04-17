package ru.netology.services;

public class VacationCalculationService {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance = balance - expenses;
                balance = balance / 3;
                counter++;
            } else {
                balance = balance + income;
                balance = balance - expenses;
            }
        }
        return counter;
    }
}
