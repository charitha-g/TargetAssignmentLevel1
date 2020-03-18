package com.tgt.igniteplus;

import java.util.Scanner;

public class sequenceQ21 {
    public static void main(String[] args) {
        int i, term = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            term = term + (i * i);
            if (i % 2 != 0)
                System.out.print("-");
            System.out.print(term + " ");

        }
    }
}

