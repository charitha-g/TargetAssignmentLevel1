package com.tgt.igniteplus;

import java.util.*;
public class swap3numbers
{
    static int a, b, c;
    static void swapThree()
    {
        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A and B and C");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Before swapping a = " +  a + ", b = " + b + ", c = " + c);
        swapThree();
        System.out.println("After swapping a = " +   a + ", b = " + b +  ", c = " + c);
    }
}
