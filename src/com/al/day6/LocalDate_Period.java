package com.al.day6;

import java.time.LocalDate;
import java.time.Period;

public class LocalDate_Period {
    public static void main(String args[]) {
        System.out.println();
        if (majority(17, 2, 2000))
            System.out.println("dziad");
        else
            System.out.println("dzieciak");
    }

    public static boolean majority(int day, int month, int year) {
        LocalDate dateOfBirth, now;
        dateOfBirth = LocalDate.of(year, month, day);
        now = LocalDate.now();
        Period p = Period.between(dateOfBirth, now);
        if (p.getYears() >= 18) return true;
        return false;

    }
}
