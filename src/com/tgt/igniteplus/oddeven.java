package com.tgt.igniteplus;

import java.util.*;
public class oddeven
{
    public static boolean isEven(int n)
    {
        return (n % 2 == 0);
    }
    public static void main(String[] args)
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        if(isEven(n) == true)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}

