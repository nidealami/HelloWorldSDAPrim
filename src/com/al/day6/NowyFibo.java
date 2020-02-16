package com.al.day6;

public class NowyFibo {
    public static void main(String[] args) {
        int n = 20;
        int r = fibon(n);
        System.out.println("fibon(n) = " + r);
    }

    public static int fibon(int n) {

        if (n == 0 || n == 1) return n;
        return fibon(n - 1) + fibon(n - 2);

    }
}
