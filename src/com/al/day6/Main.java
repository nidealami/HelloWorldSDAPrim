package com.al.day6;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 10;

    public static void main(String args[]) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int tab[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            tab[i] = randomNum.nextInt(1000);
        }

        printTab(tab);
        printTabEnd(tab);
        printTabNiepa(tab);
        printTabTrzy(tab);
        System.out.println("Suma = " + sum(tab));
        System.out.println("Suma n liczb = " + sumN(tab, 5));
        int r = sumM(tab, 5, 5);
        System.out.println("Suma m liczb większych od x = " + r);
        int il = number(tab, 1000);
        System.out.println("ilosc: " + il);
        System.out.println("Przekroczylam liczbę po: " + number(tab, 5000));
        System.out.println("Podaj dzielnik: ");
        // int divider = scan.nextInt();
        printModN(tab, scan.nextInt());
        int t[] = find2Min(tab);
        System.out.println("2 min elementy to:" + tab[t[0]] + "oraz" + tab[t[1]]);
    }


    public static void printTab(int[] tab) {
        int i;
        for (i = 0; i < SIZE - 1; i++) {
            System.out.print(tab[i] + ",");
        }
        System.out.println(tab[i]);
    }

    public static void printTabEnd(int[] tab) {

        for (int i = SIZE - 1; i >= 0; i--) {
            System.out.print(tab[i] + ",");
        }
        System.out.println();

    }

    public static void printTabNiepa(int[] tab) {

        for (int i = 0; i < SIZE; i += 2) {
            System.out.print(tab[i] + ",");
        }
        System.out.println();

    }

    public static void printTabTrzy(int[] tab) {

        for (int i = 0; i < SIZE; i++) {
            if (tab[i] % 3 == 0) {
                System.out.print(tab[i] + ",");
            }
            System.out.println();
        }
    }

    public static long sum(int[] tab) {
        long result = 0;

        for (int i = 0; i < SIZE; i++) {
            result += tab[i];
        }
        return result;
    }

    public static long sumN(int[] tab, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += tab[i];
        }
        return result;

    }

    public static int sumM(int[] tab, int m, int x) {
        int result2 = 0;

        for (int i = tab.length - 1; i > tab.length - 1 - m; i--) {
            if (tab[i] > x) result2 += tab[i];
            {
            }
        }
        return result2;
    }

    public static int number(int[] tab, int m) {
        int num = 0;
        int result3 = 0;
        for (int i = 0; i < tab.length; i++) {
            result3 += tab[i];

            if (result3 >= m) break;
            num++;
        }
        return num;

    }

    public static void printModN(int[] tab, int n) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % n == 0) {
                System.out.println(tab[i] + " ");
            }
            System.out.println();
        }
    }

    //dwa najmniejsze elementy z danej tablicy
    public static int[] find2Min(int[] tab) {
        int p1;
        int p2;
        int temp;
        p1 = 0;
        p2 = 1;
        if (tab[p1] > tab[p2]) {
            p1 = 1;
            p2 = 0;
        }
        int i = 2;
        while (i < tab.length) {
            if (tab[i] < tab[p2]) {
                p2 = i;
                if (tab[p1] > tab[p2]) {
                    temp = p1;
                    p1 = p2;
                    p2 = temp;
                }
            }
            i++;
        }
        int[] t=new int [2];
        t[0]=p1;
        t[1]=p2;
        return t;
    }
}

