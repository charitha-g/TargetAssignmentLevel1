package com.tgt.igniteplus;

import java.util.Scanner;

public class sequenceQ11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        for(int i=2;Math.pow(i,2)<=n;i=i+2)
        {
            int a=(int)Math.pow(i,2);
            System.out.print(" "+a);
        }
    }
}


