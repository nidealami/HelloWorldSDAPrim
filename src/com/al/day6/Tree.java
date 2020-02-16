package com.al.day6;

public class Tree {

    public static void main(String[] args) {
        createTree(3);
        var pustyZnak = " ";
        var gwiazda = "*";


        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < 5 * 2; x++) {
                if (x < (4 - i) || x > (4 + i)) {
                    System.out.print(pustyZnak);
                } else {

                    System.out.print(gwiazda);
                }
            }
            System.out.println();
        }
    }

    private static void createTree(int H) {
        int width = 2 * H - 1;
        for (int i = 1; i <= H; i++) {
            for (int j = 0; j < width - (2 * i - 1) / 2; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < width+i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

    }
}
// dla sprawdzenia


