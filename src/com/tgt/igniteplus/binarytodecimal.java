package com.tgt.igniteplus;

import java.util.Scanner;

public class binarytodecimal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary value");
        int n=sc.nextInt();
        int num = n;
        int decimalvalue = 0;
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            decimalvalue += last_digit * base;

            base = base * 2;

        }
        System.out.println(decimalvalue);
    }
}