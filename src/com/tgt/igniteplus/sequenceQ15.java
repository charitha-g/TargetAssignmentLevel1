package com.tgt.igniteplus;

import java.util.Scanner;

public class sequenceQ15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int i;
        for(i=1;(i*i)<=n;i++)
            System.out.print((i*i)+" ");
    }
}