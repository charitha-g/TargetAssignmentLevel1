package com.tgt.igniteplus;

import java.util.Scanner;

public class sequenceQ23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n, i, j;
        n = sc.nextInt();
        for (i = 1, j = -2; i <= n; i = i + 3, j = j - 4)
            System.out.print(i + " " + j + " ");
    }
}
