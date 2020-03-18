package com.tgt.igniteplus;

import java.util.Scanner;

public class sumofeven {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int number, i, evenSum = 0;
        sc = new Scanner(System.in);

        System.out.print(" Enter a number : ");
        number = sc.nextInt();

        for(i = 2; i <= number; i++)
        {
            if(i % 2 == 0)
            {
                evenSum = evenSum + i;
            }
        }
        System.out.println("\n The Sum of even Numbers upto " + number + "  =  " + evenSum);
    }
}
