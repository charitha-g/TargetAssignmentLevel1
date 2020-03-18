package com.tgt.igniteplus;

import java.util.*;
public class reversenumber
{
    public static void main(String[] args)
    {
        int num , reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = sc.nextInt();
        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
