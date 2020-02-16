package com.al.day6;

import java.util.Random;

public class Main2 {

    private static final int SIZE1 = 5;
    private static final int SIZE2 = 3;

    public static void main(String args[]) {
        Random randomNum = new Random();
        int tab[][] = new int[SIZE1][SIZE2];
        for (int i = 0; i < SIZE1; i++) {
            for (int j = 0; j < SIZE2; j++) {
                tab[i][j] = randomNum.nextInt(10);
            }
        }
      // int tab1[][] = createTab(10, 5);
        printTab(tab);

        System.out.println();


    }

    private static void printTab(int[][] tab) {
        int i;
        int j;
        for (i = 0; i < SIZE1; i++) {
            for (j = 0; j < SIZE2; j++) {
                System.out.print(tab[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static void createTab(int H, int W) {

        int tab1[][] = new int[3][4];

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[0].length; j++) {
                System.out.print(tab1[H][W] + ",");
            }
            System.out.println();
            return;
        }
    }
}
//dom: Metoda: transpozycja macierzy
// public static int [][]createTab(int [][] tab){
//ma zwrócić odwrotnie kolumny z wierszem