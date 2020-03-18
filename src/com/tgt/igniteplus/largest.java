package com.tgt.igniteplus;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int largest, secondlargest;
        if(a>b) {
            if (a > c) {
                largest = a;
                if(c>b)
                    secondlargest=c;
                else
                    secondlargest=b;
            }
            else {
                largest = c;
                secondlargest=a;
            }
        }
        else if (b>c) {
            largest = b;
            if(a>c)
                secondlargest=a;
            else
                secondlargest=c;
        }
        else {
            largest = c;
            secondlargest=b;
        }
        System.out.println(largest+" is com.tgt.igniteplus.largest and "+secondlargest+" is second com.tgt.igniteplus.largest");
    }
}