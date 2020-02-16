package com.al.day6;

public class Rekurencja {
    public static void main(String[] args) {
        int n = 5;
        int r=silnia(n);
        System.out.println(n+"! = "+r);
    }

    public static int silnia(int n) {
        if (n == 0) return 1;
        return n * silnia(n - 1);
    }
}
