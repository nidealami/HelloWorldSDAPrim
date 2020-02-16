package com.al.day6;

import java.util.Arrays;
import java.util.Random;

import static com.al.day6.Main.printTab;

public class GorszySort {
    public static final int SIZE = 1000;

    public static void main(String args[]) {

        Random random = new Random();
        int tab[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            tab[i] = random.nextInt(1000);
        }
        printTab(tab);
        long t1 = System.currentTimeMillis();
        BubbleSort(tab);
        long t2 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("czas sortowania " + (t2 - t1) + " ms");
    }

    public static void BubbleSort(int[] tab) {
        int temp;
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] tab) {
        int pmin, temp;
        for (int i = 0; i < tab.length - 1; i++) {
            pmin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[pmin]) pmin = j;
            }
            temp=tab[pmin];
            tab[pmin]=tab[i];
            tab[i]=temp;
        }
    }
}

